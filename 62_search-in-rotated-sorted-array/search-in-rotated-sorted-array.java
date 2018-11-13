/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/search-in-rotated-sorted-array
@Language: Java
@Datetime: 16-12-19 11:04
*/

public class Solution {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        if(A == null || A.length == 0){
            return -1;
        }
        int start = 0, end = A.length - 1;
        while(start + 1 < end){
            int mid = (end + start) / 2;
            if(A[mid] == target){
                return mid;
            }
            if(A[start] < A[mid]){
                if(A[start] <= target && target <= A[mid]){
                    end = mid;
                }else{
                    start = mid;
                }
            }else{
                if(A[mid] < target && target <= A[end]){
                    start = mid;
                }else{
                    end = mid;
                }
            }
        }
        if(A[start] == target){
            return start;
        }else if(A[end] == target){
            return end;
        }else{
            return -1;
        }
    }
}
