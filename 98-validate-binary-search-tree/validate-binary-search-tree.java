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
//     List<Integer> list = new ArrayList<>();
//     public boolean isValidBST(TreeNode root) {
//         inOrder(root);

//         for(int i=1;i<list.size();i++){
//             if(list.get(i)<=list.get(i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }
//     void inOrder(TreeNode node){
//         if(node==null) return;

//         inOrder(node.left);
//         list.add(node.val);
//         inOrder(node.right);
//     }
// }




class Solution {
    public boolean isValidBST(TreeNode root) {
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    boolean check(TreeNode node,long min,long max){
        if(node==null) return true;

        if(node.val<=min || node.val>=max){
            return false;
        }

        return check(node.left,min,node.val) && check(node.right,node.val,max);
    }
  
}