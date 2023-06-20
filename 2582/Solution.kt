class Solution {
    fun passThePillow(n: Int, time: Int): Int {
        var ans: Int = 1
        var turn: Int = time
        var dir: Int = 1
        
        while (turn > 0) {
            ans += dir
            turn -= 1
            
            if (ans == 1 || ans == n) {
                dir *= -1
            }
        }
        
        return ans
    }
}
