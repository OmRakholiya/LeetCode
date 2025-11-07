/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         for(ListNode a=headA;a!=null;a=a.next){
//             for(ListNode b=headB;b!=null;b=b.next){
//                 if(a==b){
//                     return a;
//                 }
//             }
//         }return null;
//     }
// }

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashSet<ListNode> set = new HashSet<>();
//         ListNode curr = headA;
//         while(curr!=null){
//             set.add(curr);
//             curr=curr.next;
//         }
//         curr=headB;
//         while(curr!=null){
//             if(set.contains(curr)){
//                 return curr;
//             }
//             curr=curr.next;
//         }return null;
//     }
// }


// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA==null || headB==null){
//             return null;
//         }
//         ListNode a=headA,b=headB;
//         while(a!=b){
//             a=(a==null) ? headB : a.next;
//             b=(b==null) ? headA : b.next;
//         }
//         return a;
//     }
// }

// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         if(headA==null || headB==null){
//             return null;
//         }
//         ListNode a=headA,b=headB;
//         while(a!=b){
//             a=(a==null) ? headB : a.next;
//             b=(b==null) ? headA : b.next;
//         }
//         return a;
//     }
// }


public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=length(headA);
        int lenB=length(headB);
        while(lenA>lenB){
            headA=headA.next;
            lenA--;
        }
        while(lenA<lenB){
            headB=headB.next;
            lenB--;
        }
        while(headA!=null || headB!=null){
            if(headA==headB){
                return headA;
            }
            headA=headA.next;
            headB=headB.next;
        }
        return null;
    }
    public int length(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
}