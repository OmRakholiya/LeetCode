// class Solution {
//     public int longestSubarray(int[] nums) {
//         int ans = 0;
//         for(int i=0;i<nums.length;i++){
//             int count=0;
//             int max=0;
//             for(int j=0;j<nums.length;j++){
//                 if(j==i) continue;
//                 if(nums[j]==1){
//                     count++;
//                     max=Math.max(max,count);
//                 }  
//                 else{
//                     count=0;
//                 }
//             }
//             ans=Math.max(ans,max);      
//         }
//         return ans;
//     }
// }


class Solution {
    public int longestSubarray(int[] nums) {
        int l=0;
        int zero=0;
        int maxLen=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                zero++;
            }
            while(zero>1){
                if(nums[l]==0) zero--;
                l++;
            }
            maxLen=Math.max(maxLen,r-l);
        }
        return maxLen;
    }
}

