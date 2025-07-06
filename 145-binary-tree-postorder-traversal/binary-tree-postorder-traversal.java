/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> val=new ArrayList<>();
        postOrder(root,val);
        return val;
    }
    static void postOrder(TreeNode root,List<Integer> val){
        if(root==null){
            return;
        }
        postOrder(root.left,val);
        postOrder(root.right,val);
        val.add(root.val);
    }
}