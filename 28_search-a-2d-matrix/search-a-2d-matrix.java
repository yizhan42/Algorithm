/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/search-a-2d-matrix
@Language: Java
@Datetime: 16-12-16 01:35
*/

public class Solution {
    /**
     * @param matrix, a list of lists of integers
     * @param target, an integer
     * @return a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        /*
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int row, colum;
        int start = 0; end = row * colum - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if(matrix[mid] == target){
                return true;
            }else if(matrix[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(matrix[start] == target){
            return true;
        }else if(matrix[end] == target){
            return true;
        }else{
            return false;
        }
        */
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }
        
        int row = matrix.length, column = matrix[0].length;
        int start = 0, end = row * column - 1;
        
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            int number = matrix[mid / column][mid % column];
            if (number == target) {
                return true;
            } else if (number < target) {
                start = mid;
            } else {
                end = mid;
            }
        }
        
        if (matrix[start / column][start % column] == target) {
            return true;
        } else if (matrix[end / column][end % column] == target) {
            return true;
        }
        
        return false;
    }
}
