class Solution {
    fun findTheArrayConcVal(nums: IntArray): Long {
        var ans: Long = 0
        val n: Int = nums.size
        
        for (i in 0..n/2-1) {
            var concat: String = nums[i].toString() + nums[n-1-i].toString()
            ans += concat.toInt()
        }
        
        if (n % 2 == 1) {
            ans += nums[n/2]
        }
        
        return ans
    }
}
