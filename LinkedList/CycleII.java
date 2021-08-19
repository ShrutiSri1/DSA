/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null|| head.next==null) return null;
        if(head.next==head) return head;
        ListNode slow=head,fast=head;
        int i=0;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            i=i+1;
            if(fast==slow)
            {
               slow=head;
                while(slow!=fast)
                {
                    slow=slow.next;
                    fast=fast.next;
                }  
                
                return slow;
            }
        }
        return null;
    }
}
