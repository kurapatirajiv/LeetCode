

// Problem : https://leetcode.com/problems/add-two-numbers/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0);
        ListNode curr = head;
        int sum = 0;
        while(l1!=null || l2!=null){
        int first  = (l1!=null) ? l1.val : 0;
        int second = (l2!=null) ? l2.val : 0;
        sum = carry + first + second; 
        carry = sum/10;
        curr.next = new ListNode(sum%10);
        curr = curr.next; 
        if(l1!=null){
            l1 = l1.next;
        }
        if(l2!=null){
            l2 = l2.next;    
        }
        
        }
        if(carry>0){
            curr.next = new ListNode(carry);
            }        
        return head.next;
    }
}