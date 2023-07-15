class Solution {
    fun isWinner(player1: IntArray, player2: IntArray): Int {
        var score1: Int = calcScore(player1)
        var score2: Int = calcScore(player2)
        
        if (score1 > score2) {
            return 1
        } else if (score2 > score1) {
            return 2
        }
        return 0
    }
    
    private fun calcScore(pins: IntArray): Int {
        var score: Int = 0
        var doubleCount: Int = 0
        
        for (pin in pins) {
            if (doubleCount > 0) {
                score += pin * 2
                doubleCount -= 1
            } else {
                score += pin
            }
            
            if (pin == 10) {
                doubleCount = 2
            }
        }
        
        return score
    }
}
