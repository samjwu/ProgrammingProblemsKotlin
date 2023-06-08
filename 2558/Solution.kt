class Solution {
    fun pickGifts(gifts: IntArray, k: Int): Long {
        val maxHeap: PriorityQueue<Int> = PriorityQueue<Int> { a: Int, b: Int -> b - a }
        
        for (pile in gifts) {
            maxHeap.add(pile)
        }
        
        for (i in 1..k) {
            var maxPile: Double = maxHeap.poll().toDouble()
            var reduced: Double = Math.sqrt(maxPile)
            maxHeap.add(reduced.toInt())
        }
        
        var ans: Long = 0
        while (maxHeap.isNotEmpty()) {
            ans += maxHeap.poll()
        }
        
        return ans
    }
}
