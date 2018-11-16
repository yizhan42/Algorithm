/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/move-zeroes
@Language: C++
@Datetime: 17-02-25 12:17
*/

class Solution {
public:
    /**
     * @param nums an integer array
     * @return nothing, do this in-place
     */
    void moveZeroes(vector<int>& nums) {
        // Write your code here
         int left = 0, right = 0;
        while (right < nums.size()) {
            if (nums[right]) {
                swap(nums[left++], nums[right]);
            }
            right++;
        }
    }
};