/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/maximum-subarray
@Language: Java
@Datetime: 17-02-25 12:06
*/

// Version 1: Greedy

public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    public int maxSubArray(int[] A) {
        // write your code
        if (A == null || A.length == 0){
            return 0;
        }
        
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }

        return max;
    }
}