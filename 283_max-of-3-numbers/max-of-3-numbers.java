/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/max-of-3-numbers
@Language: Java
@Datetime: 16-03-09 05:19
*/

public class Solution {
    /**
     * @param num1 an integer
     * @param num2 an integer
     * @param num3 an integer
     * @return an integer
     */
    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        // Write your code here
        int max = num1;
        if (num2 >= max){
            max = num2;
        }
        if(num3 >= max){
            max = num3;
        }
    
    return max;
}
}