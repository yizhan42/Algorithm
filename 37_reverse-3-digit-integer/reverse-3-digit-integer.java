/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/reverse-3-digit-integer
@Language: Java
@Datetime: 16-03-09 05:45
*/

class Solution {
    /*
     * param number: A 3-digit number.
     * return: Reversed number.
     */
    public int reverseInteger(int number) {
        // write your code here
        int a = number % 10;
        int b =((number-a)/10)%10;
        int c= number/100;
        return a*100+b*10+c;
    }
};
