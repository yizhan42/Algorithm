/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/subsets-ii
@Language: Java
@Datetime: 17-02-25 03:06
*/

class Solution {
    /**
     * @param nums: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        if( nums == null || nums.length == 0 ) return results;
        
        Arrays.sort(nums);

        ArrayList<Integer> subset = new ArrayList<>();
        helper(nums, 0, subset, results);
        
         return results;
        
        
    }
    public void helper(int[] nums, int startIndex, ArrayList<Integer> subset, ArrayList<ArrayList<Integer>> results){
        results.add(new ArrayList<Integer>(subset));
        for(int i=startIndex; i<nums.length; i++){
            if (i != startIndex && nums[i] == nums[i-1]) {
                continue;
            }
            subset.add(nums[i]);
            helper(nums, i+1, subset, results);
            subset.remove(subset.size()-1);
        }
    }
}
