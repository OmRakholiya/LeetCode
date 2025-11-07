// class Solution {
//     public int longestOnes(int[] nums, int k) {
//         int maxLen =0;
//         for(int i=0;i<nums.length;i++){
//             int zero=0;
//             for(int j=i;j<nums.length;j++){
//                 if(nums[j]==0){
//                     zero++;
//                 }
//                 if(zero<=k){
//                     maxLen=Math.max(maxLen,j-i+1);
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
//         return maxLen;
//     }
// }



class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxLen =0;
        int l=0;
        int r=0;
        int zero=0;
        int n= nums.length;
        while(r<n){
            if(nums[r]==0)    zero++;
            if(zero>k){
                if(nums[l]==0){
                    zero--;
                }
                l++;
            }
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }return maxLen;
    }
}