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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        dfs(root,0,ans);
        return ans;

    }
    private void dfs(TreeNode root,int level,List<List<Integer>> ans){
        if(root==null) return;

        if(level==ans.size()){
            ans.add(new ArrayList<>());
        } 
        ans.get(level).add(root.val);

        dfs(root.left,level+1,ans);
        dfs(root.right,level+1,ans);

    }
}

// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans = new ArrayList<>();
//         if(root==null) return ans;

//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);

//         while(!queue.isEmpty()){
//             int size = queue.size();
//             List<Integer> level = new ArrayList<>();

//             for(int i=0;i<size;i++){
//                 TreeNode node = queue.poll();
//                 level.add(node.val);

//                 if(node.left!=null) 
//                     queue.offer(node.left);

//                 if(node.right!=null) 
//                     queue.offer(node.right);
//             }
//             ans.add(level);
//         }
//         return ans;
//     }
// }