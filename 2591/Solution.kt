class Solution {
    fun distMoney(money: Int, children: Int): Int {
        val freeCash: Int = money - children
        val get8Dollars: Int = freeCash / 7
        val remainingCash: Int = freeCash % 7
        
        if (freeCash < 0) {
            // not enough to give 1 to all
            return -1
        } else if (get8Dollars == children && remainingCash == 0) {
            // enough to give exactly 8 to all
            return children
        } else if (get8Dollars == children-1 && remainingCash == 3) {
            // enough to give exactly 8 to all minus one, but the last got 4
            // the last two get some split of 12 (that is not 8 and 4)
            return children-2
        }
        
        if (get8Dollars > children-1) {
            // enough to give exactly 8 to all minus one (last one gets remainder)
            return children-1
        }
        // give exactly 8 to as many as possible, and remainder is distributed to the rest
        return get8Dollars
    }
}
