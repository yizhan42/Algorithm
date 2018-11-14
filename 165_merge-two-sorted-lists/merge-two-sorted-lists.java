/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/merge-two-sorted-lists
@Language: Java
@Datetime: 16-03-31 05:40
*/

/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param ListNode l1 is the head of the linked list
     * @param ListNode l2 is the head of the linked list
     * @return: ListNode head of linked list
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // write your code here
       
        ListNode dummy = new ListNode(0);
       ListNode head = dummy;
        
        while((l1 != null) && (l2 !=null)){
             if(l1.val <= l2.val){
            head.next = l1;
            l1 = l1.next;
        }else{
            head.next = l2;
             l2 = l2.next;
        }
          head = head.next;
        }
        if (l1 == null){
            head.next = l2;
        }else
        {
            head.next = l1;
        }
       return dummy.next;
    }
}