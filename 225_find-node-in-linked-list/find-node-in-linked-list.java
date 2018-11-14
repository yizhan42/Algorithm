/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/find-node-in-linked-list
@Language: Java
@Datetime: 16-10-10 10:33
*/

/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param head: the head of linked list.
     * @param val: an integer
     * @return: a linked node or null
     */
    public ListNode findNode(ListNode head, int val) { 
        // Write your code here
        for(ListNode node = head;node != null;node = node.next){
        if(node.val == val){
               return node;
           }
        }
          
           return null;
        }
    
}

/*
for(ListNode node = head; node != null; node = node.next){
    if(node.val == val){
        return node;
    }
}
    return null;
 */