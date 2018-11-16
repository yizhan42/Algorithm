/*
@Copyright:LintCode
@Author:   zhanyi
@Problem:  http://www.lintcode.com/problem/convert-linked-list-to-array-list
@Language: Java
@Datetime: 16-10-11 08:55
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
     * @param head the head of linked list.
     * @return an array list
     */
    public List<Integer> toArrayList(ListNode head) {  
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        while(head != null){
            result.add(head.val);
            head = head.next;
        }
        return result;
    }
}

/*
List<Integer> result = new ArrayList<Integer>();
while(head != null){
    result.add(head.val);
    head = head.next;
}
return result;
*/