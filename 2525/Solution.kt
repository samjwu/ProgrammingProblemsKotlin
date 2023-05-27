class Solution {
    fun categorizeBox(length: Int, width: Int, height: Int, mass: Int): String {
        val isBulky: Boolean = isBoxBulky(length.toLong(), width.toLong(), height.toLong())
        val isHeavy: Boolean = mass >= 100
        
        if (isBulky && isHeavy) {
            return "Both"
        } else if (isBulky) {
            return "Bulky"
        } else if (isHeavy) {
            return "Heavy"
        }
        return "Neither"
    }
    
    private fun isBoxBulky(length: Long, width: Long, height: Long): Boolean {
        if (length >= 10000 || width >= 10000 || height >= 10000) {
            return true
        }
        
        if (length * width * height >= 1e9) {
            return true
        }
        
        return false
    }
}
