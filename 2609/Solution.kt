class Solution {
    fun findTheLongestBalancedSubstring(s: String): Int {
        var ans: Int = 0
        val n: Int = s.length
        
        for (i in 0..n-2) {
            for (j in i+1..n-1) {
                if (isBalanced(s, i, j)) {
                    ans = Math.max(ans, j-i+1)
                }
            }
        }
        
        return ans
    }
    
    private fun isBalanced(s: String, i: Int, j: Int): Boolean {
        val n: Int = j-i+1
        
        if (n % 2 == 1) {
            return false
        }
        
        val half: Int = (i + j + 1) / 2
        
        for (idx in i..half-1) {
            if (s[idx] != '0') {
                return false
            }
        }
        for (idx in half..j) {
            if (s[idx] != '1') {
                return false
            }
        }
        
        return true
    }
}
