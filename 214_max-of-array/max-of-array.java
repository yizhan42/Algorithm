/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/max-of-array
@Language: Java
@Datetime: 16-03-09 05:04
*/

public class Solution {
    /**
     * @param A a float array
     * @return a float number
     */
    public float maxOfArray(float[] A) {
        // Write your code here
        int i;
      
        float max = A[0];
        for(i = 1; i < A.length ;i++){
            if(A[i] > max){
                max = A[i];
            }
        }
        return max;
    }
}