// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
// */

// class Solution {
//     public ListNode rotateRight(ListNode head, int k) {

//         if(head == null || head.next == null || k == 0) return head;

//         ListNode tail = head;
//         int len = 1;
//         while(tail.next != null){
//             len++;
//             tail = tail.next;
//         }
//         if(k % len == 0) return head;
//         k = k % len;
//         tail.next = head;

//         ListNode newtail = findnewtail(head,len-k);
//         head = newtail.next;
//         newtail.next = null;

//         return head; 
//     }

//     public ListNode findnewtail(ListNode tem, int k){
//         int count = 1;
        
//         while(tem != null){
//             if(count == k) return tem;
//             count++;
//             tem = tem.next;
//         }
//         return tem;
//     }
// }


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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) return head;

        ListNode tail = head;
        int len = 1;
        while(tail.next != null){
            len++;
            tail = tail.next;
        }
        if(k % len == 0) return head;
        k = k % len;
        tail.next = head;

        ListNode newtail = head;
        for(int i=1;i<len-k;i++){
            newtail = newtail.next;
        }
        ListNode newhead = newtail.next;
        newtail.next = null;

        return newhead; 
    }
}