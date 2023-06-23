class Solution {
    fun evenOddBit(n: Int): IntArray {
        val ans: IntArray = IntArray(2)
        var binary = ArrayList<Int>()
        var num: Int = n
        
        while (num > 0) {
            binary.add(num % 2)
            num /= 2
        }
        
        for (i in 0..binary.size-1) {
            if (binary[i] == 1) {
                if (i % 2 == 0) {
                    ans[0] += 1
                } else {
                    ans[1] += 1
                }
            }
        }
        
        return ans
    }
}
