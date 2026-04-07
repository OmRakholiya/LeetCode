/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null)return null;
        HashMap<Node,Node> map = new HashMap<>();

        Node tem = head;
        while(tem != null){
            map.put(tem ,new Node(tem.val));
            tem = tem.next;
        }

        tem = head;
        while(tem != null){
            Node copy = map.get(tem);
            copy.next = map.get(tem.next);
            copy.random = map.get(tem.random);
            tem = tem.next;
        }
        return map.get(head);
    }
}