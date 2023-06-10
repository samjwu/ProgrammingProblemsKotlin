class Solution {
    fun minMaxDifference(num: Int): Int {
        var hi: Int = num
        var lo: Int = num
        
        for (i in 0..9) {
            hi = Math.max(hi, remap(num, i, 9))
            lo = Math.min(lo, remap(num, i, 0))
        }
        
        return hi-lo
    }
    
    private fun remap(num: Int, from: Int, to: Int): Int {
        val s: String = num.toString()
        val rep: String = s.replace('0' + from, '0' + to)
        return rep.toInt()
    }
}
