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
//     int sum = 0;
//     public int sumRootToLeaf(TreeNode root) {
//         dfs(root,"");
//         return sum;
//     }
//     public void dfs(TreeNode node , String path){
//         if(node == null) return;
//         path += node.val;

//         if(node.left == null && node.right == null){
//             int num = Integer.parseInt(path,2);
//             sum += num;
//             return;
//         }
//         dfs(node.left,path);
//         dfs(node.right,path);
//     }
// }   





class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root,0);
    }
    public int dfs(TreeNode node , int curr){
        if(node == null) return 0;

        curr = curr*2 + node.val;
        if(node.left == null && node.right == null){
            return curr;
        }
        return dfs(node.left,curr) + dfs(node.right,curr);
    }
}   
