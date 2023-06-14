class Solution {
    fun leftRightDifference(nums: IntArray): IntArray {
        val n: Int = nums.size
        
        val left: IntArray = IntArray(n)
        var sumLeft: Int = 0
        for (i in 0..n-1) {
            left[i] = sumLeft
            sumLeft += nums[i]
        }
        
        val right: IntArray = IntArray(n)
        var sumRight: Int = 0
        for (i in n-1 downTo 0) {
            right[i] = sumRight
            sumRight += nums[i]
        }
        
        val ans: IntArray = IntArray(n)
        for (i in 0..n-1) {
            ans[i] = Math.abs(left[i] - right[i])
        }
        
        return ans
    }
}
