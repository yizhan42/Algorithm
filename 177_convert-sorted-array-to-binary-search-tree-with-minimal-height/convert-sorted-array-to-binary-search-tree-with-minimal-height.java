/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/convert-sorted-array-to-binary-search-tree-with-minimal-height
@Language: Java
@Datetime: 16-11-06 01:41
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
     * @param A: an integer array
     * @return: a tree node
     */
    private TreeNode buildTree(int[] num ,int start,int end){
        
        if (start > end){
             return null;
        }
        
       TreeNode node = new TreeNode(num[(start + end)/2]); 
        node.left = buildTree(num,start,(start + end)/2 - 1);
        node.right = buildTree(num,(start + end)/2 + 1,end);
        return node;
     }
    public TreeNode sortedArrayToBST(int[] A) {  
        // write your code here
        if (A == null){
            return null;
        }
        return buildTree(A,0,A.length -1);
    }  
}
