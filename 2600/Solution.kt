class Solution {
    fun kItemsWithMaximumSum(numOnes: Int, numZeros: Int, numNegOnes: Int, k: Int): Int {
        // max number of ones that can be taken
        val positive: Int = Math.min(numOnes, k)
        
        // min number of negs that must be taken
        val negative: Int = Math.max(0, k - numOnes - numZeros)
        
        return positive - negative
    }
}
