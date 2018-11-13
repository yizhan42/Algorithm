/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/permutations
@Language: Java
@Datetime: 17-02-25 03:08
*/

class Solution {
    /**
     * @param nums: A list of integers.
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        // write your code here
        ArrayList<List<Integer>> rst = new ArrayList<List<Integer>>();
         if (nums == null) {
             return rst; 
         }
         
         if (nums.length == 0) {
            rst.add(new ArrayList<Integer>());
            return rst;
         }

         ArrayList<Integer> list = new ArrayList<Integer>();
         helper(rst, list, nums);
         return rst;
    }
    
    public void helper(ArrayList<List<Integer>> rst, ArrayList<Integer> list, int[] nums){
        if(list.size() == nums.length) {
            rst.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            helper(rst, list, nums);
            list.remove(list.size() - 1);
        }
    }
}
