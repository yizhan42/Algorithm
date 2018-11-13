/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/search-insert-position
@Language: Java
@Datetime: 16-12-12 13:50
*/

public class Solution {
    /** 
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
    public int searchInsert(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0){
            return -0;
        }
        int start = 0, end = A.length - 1;
        while(start < end){
          int mid = (start + end) / 2;
          if(A[mid] == target){
              return mid;
          }else if(A[mid] < target){
              start = mid + 1;
          }else{
              end = mid - 1;
          }
        }
        if(A[start] >= target){
            return start;
        }else if(A[end] >= target){
            return end;
        }else{
            return end + 1;
        }
        
        
    }
}
