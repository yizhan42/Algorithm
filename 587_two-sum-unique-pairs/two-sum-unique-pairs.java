/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/two-sum-unique-pairs
@Language: Java
@Datetime: 17-02-25 15:23
*/

public class Solution {
    /**
     * @param nums an array of integer
     * @param target an integer
     * @return an integer
     */
    public int twoSum6(int[] nums, int target) {
        // Write your code here
         if (nums == null || nums.length < 2)
            return 0;

        Arrays.sort(nums);
        int cnt = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int v = nums[left] + nums[right];
            if (v == target) {
                cnt ++;
                left ++;
                right --;
                while (left < right && nums[right] == nums[right + 1])
                    right --;
                while (left < right && nums[left] == nums[left - 1])
                    left ++;
            } else if (v > target) {
                right --;
            } else {
                left ++;
            }
        }
        return cnt;
    }
}