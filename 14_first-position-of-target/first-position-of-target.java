/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/first-position-of-target
@Language: Java
@Datetime: 16-12-13 07:46
*/

class Solution {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        //write your code here
        if(nums == null || nums.length == 0){
            return -1;
        }
        int start = 0, end = nums.length - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                end = mid;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        if(nums[start] == target){
            return start;
        }else if(nums[end] == target){
            return end;
        }else{
            return -1;
        }
    }
}