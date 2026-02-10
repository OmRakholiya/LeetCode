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
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root == null) return true;

//         int lh = height(root.left);
//         int rh = height(root.right);

//         if(Math.abs(lh-rh)>1) return false;

//         return isBalanced(root.left) && isBalanced(root.right); 
//     }
//     int height(TreeNode node){
//         if(node==null) return 0;
//         return 1 + Math.max(height(node.left),height(node.right));
//     }
// }


class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1; 
    }
    int height(TreeNode node){
        if(node==null) return 0;
        
        int lh = height(node.left);
        if(lh == -1) return -1;

        int rh = height(node.right);
        if(rh ==-1) return -1;

        if(Math.abs(lh-rh) > 1) return -1;

        return 1 + Math.max(lh,rh);

    }
}