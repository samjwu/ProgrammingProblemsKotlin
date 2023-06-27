class Solution {
    fun diagonalPrime(nums: Array<IntArray>): Int {
        val numSet: MutableSet<Int> = mutableSetOf<Int>()
        val n: Int = nums.size
        
        for (i in 0..n-1) {
            numSet.add(nums[i][i])
            numSet.add(nums[i][n-1-i])
        }
        
        var ans: Int = 0
        
        for (number in numSet) {
            if (isPrime(number)) {
                ans = Math.max(ans, number)
            }
        }
        
        return ans
    }
    
    private fun isPrime(number: Int): Boolean {
        if (number < 2) {
            return false
        }
        
        var idx: Int = 2
        var factors: Int = 0
        
        while (idx * idx <= number) {
            if (number % idx == 0) {
                factors += 1
            }
            idx += 1
        }
        
        return factors == 0
    }
}
