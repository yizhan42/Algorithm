/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/invert-binary-tree
@Language: Java
@Datetime: 16-11-05 12:34
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
     * @param root: a TreeNode, the root of the binary tree
     * @return: nothing
     */
    public void invertBinaryTree(TreeNode root) {
        // write your code here
        
        helper(root);
        
    }
    public void helper(TreeNode root){
        if (root == null){
            return;
        }
        TreeNode node;
        node = root.left;
        root.left = root.right;
        root.right = node;
        helper(root.left);
        helper(root.right);
       
    }
}