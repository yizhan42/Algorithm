/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/palindrome-number
@Language: Java
@Datetime: 16-03-09 08:56
*/

public class Solution {
    /**
     * @param num a positive number
     * @return true if it's a palindrome or false
     */
    public boolean palindromeNumber(int num) {
        // Write your code here
        int temp = num;
        int reversed = 0;
        while (temp != 0) {
            reversed = reversed * 10 + temp % 10;
            temp = temp / 10;
        }
        return reversed == num;
    }
}