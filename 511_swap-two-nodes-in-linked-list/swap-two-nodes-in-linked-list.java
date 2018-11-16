/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/swap-two-nodes-in-linked-list
@Language: Java
@Datetime: 16-03-31 10:03
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @oaram v1 an integer
     * @param v2 an integer
     * @return a new head of singly-linked list
     */
    public ListNode swapNodes(ListNode head, int v1, int v2){
        if(v1 == v2){
            return head;
        }
        ListNode prev1 = null, curr1 = head;
        while (curr1 != null && curr1.val != v1)
        {
            prev1 = curr1;
            curr1 = curr1.next;
        }
        
         ListNode prev2 = null, curr2 = head;
        while (curr2 != null && curr2.val != v2)
        {
            prev2 = curr2;
            curr2 = curr2.next;
        }
        
        
        if (curr1 == null || curr2 == null)
            return head;
            
        if (prev1 != null)
            prev1.next = curr2;
        else //make y the new head
            head = curr2;
            
         if (prev2 != null)
            prev2.next = curr1;
        else // make x the new head
            head = curr1;
            
         ListNode temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;   
            
       return head;
    }
}