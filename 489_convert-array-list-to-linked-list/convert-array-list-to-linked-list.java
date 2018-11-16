/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/convert-array-list-to-linked-list
@Language: Java
@Datetime: 16-10-11 08:54
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
     * @param nums an integer array list
     * @return the first node of linked list
     */
    public ListNode toLinkedList(ArrayList<Integer> nums) {  
        // Write your code here
        if(nums.size() == 0){
            return null;
        }
        ListNode head = null;
        ListNode p = null;
        for(Integer num:nums){
        if(head == null){
            head = new ListNode(num);
            p = head;
         }else{
         p.next = new ListNode(num);
         p = p.next;}
        }
        return head;
    }
}
