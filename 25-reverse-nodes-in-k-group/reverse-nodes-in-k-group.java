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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tem = head;
        ListNode prevNode = null;
        ListNode nextNode = null;

        while(tem != null){
            ListNode kthNode = findkth(tem,k);
            if(kthNode == null){
                if(prevNode != null) prevNode.next = tem;
                break; 
            }

            nextNode = kthNode.next;
            kthNode.next = null;
            ListNode newHead = reverse(tem);

            if(tem == head) head = kthNode;
            else prevNode.next = kthNode;

            prevNode = tem;
            tem = nextNode;
        }
        return head;
    }
    public ListNode findkth(ListNode tem,int k){
        k--;
        while(k>0 && tem != null){
            tem = tem.next;
            k--;
        }
        return tem;
    }
    public ListNode reverse(ListNode tem){
        ListNode prev = null;
        while(tem != null){
            ListNode front = tem.next;
            tem.next = prev;
            prev = tem;
            tem = front;
        }
        return prev;
    }
}