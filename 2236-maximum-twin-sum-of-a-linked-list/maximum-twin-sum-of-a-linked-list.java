// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public int pairSum(ListNode head) {
//         ArrayList<Integer> l = new ArrayList<>();
//         while(head!=null){
//             l.add(head.val);
//             head=head.next;
//         }
//         int maxSum=0;
//         int n=l.size();
//         for(int i=0;i<n/2;i++){
//             int sum = l.get(i) + l.get(n-1-i);
//             maxSum = Math.max(maxSum,sum);
//         }
//         return maxSum;
//     }
// }

class Solution {
    public int pairSum(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            stack.push(slow.val);
            slow=slow.next;
            fast=fast.next.next;
        }
        int maxSum=0;
        
        while(slow!=null){
            int sum = slow.val + stack.pop();
            maxSum = Math.max(maxSum,sum);
            slow=slow.next;
        }
        return maxSum;
    }
}



