class Solution {
    fun countSeniors(details: Array<String>): Int {
        var ans: Int = 0
        
        for (detail in details) {
            var ageStr: String = detail.substring(11, 13)
            var ageNum: Int = ageStr.toInt()
            
            if (ageNum > 60) {
                ans += 1
            }
        }
        
        return ans
    }
}
