class Solution {
    fun minNumber(nums1: IntArray, nums2: IntArray): Int {
        val common: Int = getCommon(nums1, nums2)
        
        if (common != Int.MAX_VALUE) {
            return common
        }
        
        var small1: Int = Int.MAX_VALUE
        for (num in nums1) {
            small1 = Math.min(small1, num)
        }
        
        var small2: Int = Int.MAX_VALUE
        for (num in nums2) {
            small2 = Math.min(small2, num)
        }
        
        if (small1 < small2) {
            return small1 * 10 + small2
        }
        return small2 * 10 + small1
    }
    
    private fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        val nums1Set: Set<Int> = nums1.toSet()
        var ans: Int = Int.MAX_VALUE
        
        for (num in nums2) {
            if (nums1Set.contains(num) && ans > num) {
                ans = num
            }
        }
        
        return ans
    }
}
