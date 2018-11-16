/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/binary-tree-leaf-sum
@Language: Java
@Datetime: 16-11-04 11:24
*/

/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root the root of the binary tree
     * @return an integer
     */
    private int sum = 0;
    public int leafSum(TreeNode root) {
        // Write your code 
       helper(root);
       return sum;
    }
    public void helper(TreeNode root){
        if (root == null){
            return;
        }
        if((root.left == null)&&(root.right == null)){
            sum += root.val;
        }
        helper(root.left);
        helper(root.right);
    }
}