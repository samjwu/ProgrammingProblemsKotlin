class Solution {
    fun splitNum(num: Int): Int {
        val s: String = num.toString()
        val n: Int = s.length
        var arr: List<Char> = s.toCharArray().sorted()
        var n1: Int = 0
        var n2: Int = 0
        
        for (i in 0..n-1) {
            if (i % 2 == 0) {
                n1 *= 10
                n1 += arr[i] - '0'
            } else {
                n2 *= 10
                n2 += arr[i] - '0'
            }
        }
        
        return n1 + n2
    }
}
