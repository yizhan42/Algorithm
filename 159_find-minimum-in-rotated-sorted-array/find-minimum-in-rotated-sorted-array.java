/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/find-minimum-in-rotated-sorted-array
@Language: Java
@Datetime: 16-12-16 12:07
*/

public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        /*
        if(nums == null || nums.length == 0){
            return -1;
        }
        int min = 0;
        int start = 0, end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while(start + 1 < end){
           
            if(nums[mid] > nums[start]){
                start = mid;
            }else if(nums[mid] < nums[start]){
                end = mid;
            }else{
                return nums[mid];
            }
        }
        if(start == mid){
            return start;
        }
        if(end == mid){
            return end;
        }
        return -1;
        */
            if (nums == null || nums.length == 0) {
            return -1;
        }
        
        int start = 0, end = nums.length - 1;
        int target = nums[nums.length - 1];
        
        // find the first element <= target
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (nums[start] <= target) {
            return nums[start];
        } else {
            return nums[end];
        }
    }
}