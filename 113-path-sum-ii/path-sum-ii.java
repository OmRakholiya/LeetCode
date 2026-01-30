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
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        findPaths(root,new ArrayList<>(),targetSum);
        return ans;        
    }
    void findPaths(TreeNode node,List<Integer> path,int targetSum){
        if(node == null) return;
        path.add(node.val);
        if(node.left==null && node.right==null){
            int sum=0;
            for(int val : path){
                sum+=val;
            }
            if(sum==targetSum){
                ans.add(new ArrayList<>(path));
            }
        }
            findPaths(node.left,path,targetSum);
            findPaths(node.right,path,targetSum);
            path.remove(path.size()-1);
    }
}