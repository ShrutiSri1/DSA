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
    public boolean isPalindrome(ListNode head) {
 
      
        ListNode slow=head;
        Stack<Integer> stack=new Stack<>();
        while(slow!=null){
            stack.push(slow.val);
            slow=slow.next;
        }
        boolean k=true;
        while(head!=null){
            int x=stack.pop();
            if(head.val!=x){
                k=false;
                break;
            }
            head=head.next;
        }
        return k;
        
    }
}
