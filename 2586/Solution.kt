class Solution {
    fun vowelStrings(words: Array<String>, left: Int, right: Int): Int {
        var ans: Int = 0
        
        for (i in left..right) {
            if (isVowelString(words[i])) {
                ans += 1
            }
        }
        
        return ans
    }
    
    private val vowels = "aeiou"
    
    private fun isVowelString(word: String): Boolean {
        val end = word.length-1
        return vowels.contains(word[0]) && vowels.contains(word[end])
    }
}
