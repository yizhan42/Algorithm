/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/sort-integers
@Language: Java
@Datetime: 16-11-09 08:07
*/

public class Solution {
    /**
     * @param A an integer array
     * @return void
     */
    public void sortIntegers(int[] A) {
        // Write your code here
        int n = A.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n;j++){
                if( A[i] > A[j]){
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                    
                }
            }
        }
    }
}