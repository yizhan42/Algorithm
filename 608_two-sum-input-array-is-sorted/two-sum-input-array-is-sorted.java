/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/two-sum-input-array-is-sorted
@Language: Java
@Datetime: 17-02-25 15:23
*/

public class Solution {
    /*
     * @param nums an array of Integer
     * @param target = nums[index1] + nums[index2]
     * @return [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] nums, int target) {
        // write your code here
        if (nums == null || nums.length < 2) {
            return null;
        }
        
        int start = 0, end = nums.length - 1;
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                int[] pair = new int[2];
                pair[0] = start + 1;
                pair[1] = end + 1;
                return pair;
            }
            if (nums[start] + nums[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        
        return null;
    }
}