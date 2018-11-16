/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/swap-two-integers-in-array
@Language: Java
@Datetime: 16-09-25 01:48
*/

//public class Solution {
    /**
     * @param A an integer array
     * @param index1 the first index
     * @param index2 the second index
     * @return void
     */
   // public void swapIntegers(int[] A, int index1, int index2) {
        // Write your code her
       // int temp = A[index1];
       // A[index1] = A[index2];
       // A[index2] = temp;
        
  //  }
//}


public class Solution{
    public void swapIntegers(int[] A,int index1, int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}