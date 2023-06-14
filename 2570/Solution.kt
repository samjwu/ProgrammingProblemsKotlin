class Solution {
    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        val ans = ArrayList<IntArray>()
        val arr = IntArray(1001)
        
        for ((id, value) in nums1) {
            arr[id] += value
        }
        
        for ((id, value) in nums2) {
            arr[id] += value
        }
        
        for ((id, value) in arr.withIndex()) {
            if (value > 0) {
                ans.add(intArrayOf(id, value))
            }
        } 
        
        return ans.toTypedArray()
    }
}
