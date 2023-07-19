class Solution {
    fun circularGameLosers(n: Int, k: Int): IntArray {
        val hadBall: MutableSet<Int> = mutableSetOf<Int>()
        var gameOver: Boolean = false
        var ball: Int = 0
        var turn: Int = 1
        
        hadBall.add(0)
        while (gameOver == false) {
            ball += k * turn
            ball %= n
            turn += 1
            
            if (hadBall.contains(ball)) {
                gameOver = true
            }
            hadBall.add(ball)
        }
        
        val ans = ArrayList<Int>()
        
        for (i in 0..n-1) {
            if (hadBall.contains(i) == false) {
                ans.add(i+1)
            }
        }
        
        return ans.toIntArray()
    }
}
