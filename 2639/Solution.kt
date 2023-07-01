class Solution {
    fun findColumnWidth(grid: Array<IntArray>): IntArray {
        val rows: Int = grid.size
        val cols: Int = grid[0].size
        val ans: ArrayList<Int> = ArrayList<Int>()
        
        for (j in 0..cols-1) {
            var high: Int = getLength(grid[0][j]);
            for (i in 1..rows-1) {
                high = Math.max(high, getLength(grid[i][j]))
            }
            ans.add(high)
        }
        
        return ans.toIntArray()
    }
    
    private fun getLength(num: Int): Int {
        val str: String = num.toString()
        return str.length
    }
}
