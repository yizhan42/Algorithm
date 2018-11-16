/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/largest-divisible-subset
@Language: Java
@Datetime: 17-02-25 15:55
*/

public class Solution {
    /**
     * @param nums a set of distinct positive integers
     * @return the largest subset 
     */
    public List<Integer> largestDivisibleSubset(int[] nums) {
        // Write your code here
         Arrays.sort(nums);
        int[] f = new int[nums.length];
        int[] pre = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            f[i] = 1;
            pre[i] = i;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && f[i] < f[j] + 1) {
                    f[i] = f[j] + 1;
                    pre[i] = j;
                }
            }
        }
        
        List<Integer> ans = new ArrayList<Integer>();
        if (nums.length == 0) {
            return ans;
        }
        int max = 0;
        int max_i = 0;
        for (int i = 0; i < nums.length; i++) {
            if (f[i] > max) {
                max = f[i];
                max_i = i;
            }
        }
        ans.add(nums[max_i]);
        while (max_i != pre[max_i]) {
            max_i = pre[max_i];
            ans.add(nums[max_i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}