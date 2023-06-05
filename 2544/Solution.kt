class Solution {
    fun alternateDigitSum(n: Int): Int {
        val s: String = n.toString()
        var sum: Int = 0
        
        for (i in 0..s.length-1) {
            if (i % 2 == 0) {
                sum += s[i]-'0'
            } else {
                sum -= s[i]-'0'
            }
        }
        
        return sum
    }
}
