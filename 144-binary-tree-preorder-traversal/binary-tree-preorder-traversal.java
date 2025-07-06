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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> val=new ArrayList<>();
        preOrder(root,val);
        return val;
    }
    static void preOrder(TreeNode root,List<Integer> val){
        if(root==null){
            return;
        }
        val.add(root.val);
        preOrder(root.left,val);
        preOrder(root.right,val);
    }
}