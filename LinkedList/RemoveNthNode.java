/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int count=0;
        ListNode temp=head;
          ListNode prev;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==1 && n==1)
            return null;
       
        int k=count-n;
         if(k==0)
            return head.next;
        temp=head;
        prev=head;
        for(int i=0;i<k;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        temp.next=null;
        return head;
    }
}
