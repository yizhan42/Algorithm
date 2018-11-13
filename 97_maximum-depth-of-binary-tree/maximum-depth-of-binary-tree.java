/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/maximum-depth-of-binary-tree
@Language: Java
@Datetime: 16-11-04 12:31
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
     * @param root: The root of binary tree.
     * @return: An integer.
     */
     private int depth = 0;
    public int maxDepth(TreeNode root) {
        // write your code here
       /*
        helper(root);
        return depth;
    }
    public void helper(TreeNode root){
        if (root == null){
            return;
        }
        if ((root.left == null) && (root.right == null)){
            depth += 1;
        }
        if ((root.left != null) || (root.right != null) || (root.left !=null && root.right !=null)){
            depth += 1;
        }
        helper(root.left);
        helper(root.right);
        */
       
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    
    }
}