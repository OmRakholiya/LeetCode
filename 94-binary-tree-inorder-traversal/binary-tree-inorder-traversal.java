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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> val=new ArrayList<>();
        inOrder(root,val);
        return val;
    }
    static void inOrder(TreeNode root,List<Integer> val){
        if(root==null){
            return;
        }
        inOrder(root.left,val);
        val.add(root.val);
        inOrder(root.right,val);
    }
}