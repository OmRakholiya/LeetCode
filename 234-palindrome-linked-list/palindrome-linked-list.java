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

// class Solution {
//     public boolean isPalindrome(ListNode head) {
//         ListNode curr=head;
//          if(curr!=0 && curr%10==0){
//             return false;
//         }
//         int rev = 0;
//         while(curr>rev){
//             rev = rev*10 + x%10;
//             curr/=10;
//         }return (curr==rev || curr==rev/10);
//     }
// }



class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second = reverse(slow);
        ListNode first= head;

        while(second!=null){
            if(second.val!=first.val) return false;
            second=second.next;
            first=first.next;
        }
        return true;
    }
    private ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode front=head.next;
            head.next=prev;
            prev=head;
            head=front;
        }
        return prev;
    }
}
