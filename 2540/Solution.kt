class Solution {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        val nums1Set: Set<Int> = nums1.toSet()
        
        for (num in nums2) {
            if (nums1Set.contains(num)) {
                return num
            }
        }
        
        return -1
    }
}
