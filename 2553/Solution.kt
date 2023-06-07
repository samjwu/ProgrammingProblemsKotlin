class Solution {
    fun separateDigits(nums: IntArray): IntArray {
        val ans = ArrayList<Int>()
        
        val s = nums.joinToString("")
        for (c in s) {
            ans.add(c-'0')
        }
        
        return ans.toIntArray()
    }
}
