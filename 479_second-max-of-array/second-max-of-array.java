/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/second-max-of-array
@Language: Java
@Datetime: 16-03-07 12:44
*/

import java.lang.*;
 public class Solution {
    /**
     * @param nums: An integer array.
     * @return: The second max number in the array.
     */
    public int secondMax(int[] nums) {
        int max= Math.max(nums[0], nums[1]);
        int second = Math.min(nums[0], nums[1]);
       for (int i = 2; i < nums.length; i++){
            if (nums[i] >= max){
                second = max;
                max = nums[i];
            } else if (nums[i] > second && nums[i] < max){
                second = nums[i]; }
            else {
                second = Math.min(nums[0], nums[1]); 
                }
        }
        return second;
    }
}