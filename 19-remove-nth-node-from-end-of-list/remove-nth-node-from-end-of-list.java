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
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode tem = head;
//         int len=0;
//         while(tem!=null){
//             len++;
//             tem=tem.next;
//         }
//         if(len==n){
//             return head.next;
//         }
//         tem=head;
//         for(int i=1;i<len-n;i++){
//             tem=tem.next;
//         }
//         tem.next=tem.next.next;
//         return head;
//     }
// }



class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tem = new ListNode(0);
        tem.next=head;
        ListNode fast = tem;
        ListNode slow = tem;
        
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return tem.next;
    }
}