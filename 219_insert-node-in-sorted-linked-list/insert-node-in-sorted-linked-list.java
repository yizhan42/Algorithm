/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/insert-node-in-sorted-linked-list
@Language: Java
@Datetime: 16-10-10 01:46
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
     * @param head: The head of linked list.
     * @param val: an integer
     * @return: The head of new linked list
     */
    public ListNode insertNode(ListNode head, int val) { 
        // Write your code here
        ListNode node = new ListNode(val);
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        // find the last element <= val
        while (head.next != null && head.next.val <= val) {
            head = head.next;
        }
        node.next = head.next;
        head.next = node;
        
        return dummy.next;
    }  
}

/*
ListNode node = new ListNode(val);
ListNode dummy = new ListNode(0);
dummy.next = head;
head = dummy;

while(head.next != null && head.next.val <= val){
    head = head.next;
}
node.next = head.next;
head.next = node;

return dummy.next;
*/