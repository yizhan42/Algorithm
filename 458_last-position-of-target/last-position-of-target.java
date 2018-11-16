/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/last-position-of-target
@Language: Java
@Datetime: 16-12-07 02:15
*/

public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return an integer
     */
    public int lastPosition(int[] nums, int target) {
        // Write your code here
       /*
       if(nums == null && nums.length == 0){
            return -1;
        }
        int i = 0;
        for ( i = 0; i < nums.length ; i++ ){
            if(target == nums[i]){
                return i;
            }
            else 
            return -1;
        } 
         return i;
         */
        if(nums == null || nums.length == 0){
            return -1;
        }
        int start = 0, end = nums.length - 1;
        while(start + 1 < end){
          int mid = (start + end) / 2;
          if(nums[mid] == target){
              start = mid;
          }else if(nums[mid] < target){
              start = mid;
          }else{
              end = mid;
          }
        }
        if(nums[end] == target){
            return end;
        }
        if(nums[start] == target){
            return start;
        }
        return -1;
    }    
}