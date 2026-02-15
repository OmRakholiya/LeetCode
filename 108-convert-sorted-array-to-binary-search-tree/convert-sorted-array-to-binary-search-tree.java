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
    public TreeNode sortedArrayToBST(int[] nums) {
        return tree(nums,0,nums.length-1);
    }
    public TreeNode tree(int[] nums,int l,int r){
        if(l > r){
            return null;
        }

        int mid = (l+r)/2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = tree(nums,l,mid-1);
        root.right = tree(nums,mid+1,r);

        return root;
    }
}






// class Solution {
//     public TreeNode sortedArrayToBST(int[] nums) {
//         if(nums.length==0) return null;
//         int mid = nums.length/2;
        
//         TreeNode root = new TreeNode(nums[mid]);

//         int[] left = new int[mid];
//         for(int i=0;i<mid;i++){
//             left[i] = nums[i];
//         }
 
//         int[] right = new int[nums.length-mid-1];
//         for(int i=mid+1;i<nums.length;i++){
//             right[i-mid-1] = nums[i];
//         }

//         root.left = sortedArrayToBST(left);
//         root.right = sortedArrayToBST(right);

//         return root;
//     }
// }