class Solution {
    fun maximumCount(nums: IntArray): Int {
        val n: Int = nums.size
        
        if (nums[0] > 0 || nums[n-1] < 0) {
            return n
        }

        var neg: Int = binarySearch(n, nums, 0)
        var pos: Int = n - binarySearch(n, nums, 1)
    
        return maxOf(neg, pos)
    }

    private fun binarySearch(n: Int, nums: IntArray, target: Int): Int {
        var left: Int = 0
        var right: Int = n-1
        var mid: Int
        
        while (left <= right) {
            mid = left + (right-left)/2

            if (nums[mid] < target) {
                left = mid+1
            } else {
                right = mid-1
            }
        }
        
        return left
    }
}
