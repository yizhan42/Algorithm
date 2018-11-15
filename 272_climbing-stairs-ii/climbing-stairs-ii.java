/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/climbing-stairs-ii
@Language: Java
@Datetime: 17-02-25 16:05
*/

public class Solution {
    /**
     * @param n an integer
     * @return an integer
     */
    public int climbStairs2(int n) {
        // Write your code here
        int[] f = new int[n+1];
        f[0] = 1;
        for (int i = 0; i <= n; i++) 
            for (int j = 1; j <= 3; j++) {
                if (i >= j) {
                    f[i] += f[i-j];
                }
            }
        return f[n];
    
    }
}