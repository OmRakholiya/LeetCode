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
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         return add(l1,l2,0);
//     }
//     public ListNode add(ListNode l1,ListNode l2,int carry){
//         if(l1==null && l2==null && carry==0){
//             return null;
//         }
//         int sum=carry;
//         if(l1!=null){
//             sum+=l1.val;
//         }
//         if(l2!=null){
//             sum+=l2.val;
//         }
//         ListNode node = new ListNode(sum%10);
//         node.next = add((l1!=null ? l1.next : null),(l2!=null ? l2.next : null),sum/10);
//         return node;

//     }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tem = new ListNode(0);
        ListNode curr = tem;
        int carry = 0;

        while(l1!=null || l2!=null || carry!=0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry = sum/10;
            curr.next = new ListNode(sum%10);
            curr = curr.next;
        }    
        return tem.next;
    }
}