class Solution {
    fun maxDivScore(nums: IntArray, divisors: IntArray): Int {
        var ans: Int = Int.MAX_VALUE
        var maxScore: Int = 0
        
        for (i in 0..divisors.size-1) {
            var currScore: Int = 0
            
            for (j in 0..nums.size-1) {
                if (nums[j] % divisors[i] == 0) {
                    currScore += 1
                }
            }
            
            if (currScore == maxScore) {
                ans = minOf(ans, divisors[i])
            } else if (currScore > maxScore) {
                ans = divisors[i]
                maxScore = currScore
            }
        }
        
        return ans
    }
}
