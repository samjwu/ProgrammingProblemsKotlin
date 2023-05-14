class Solution {
    fun differenceOfSum(nums: IntArray): Int {
        var elementSum: Int = 0
        var digitSum: Int = 0
        
        for (num in nums) {
            elementSum += num
            var n: Int = num
            while (n > 0) {
                digitSum += n % 10
                n /= 10
            }
        }
        
        return Math.abs(elementSum - digitSum)
    }
}
