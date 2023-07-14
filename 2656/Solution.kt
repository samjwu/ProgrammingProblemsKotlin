class Solution {
    fun maximizeSum(nums: IntArray, k: Int): Int {
        var ans: Int = 0
        var high: Int = nums.max() ?: 1
        var times: Int = k
        
        while (times > 0) {
            ans += high
            high += 1
            times -= 1
        }
        
        return ans
    }
}
