class Solution {
    fun rowAndMaximumOnes(mat: Array<IntArray>): IntArray {
        val m: Int = mat.size
        val n: Int = mat[0].size
        val ans: IntArray = IntArray(2)
        
        var row: Int = 0
        var ones: Int = 0
        
        for (i in 0..m-1) {
            var currOnes: Int = 0
            
            for (j in 0..n-1) {
                currOnes += mat[i][j]
            }
            
            if (currOnes > ones) {
                row = i
                ones = currOnes
            }
        }
        
        ans[0] = row
        ans[1] = ones
        
        return ans
    }
}
