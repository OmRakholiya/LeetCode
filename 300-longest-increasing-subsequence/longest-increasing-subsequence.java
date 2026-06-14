// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         int maxLen = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length-1;i++){
//             int count=0;
//             for(int j=i;j<nums.length;j++){
//                 if(nums[j]>nums[i]){
//                     maxLen=Math.max(maxLen,count);
//                     count++;
//                 }
//             }
//         }return (maxLen == Integer.MIN_VALUE) ? 1 : maxLen;
//     }
// }


class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int ans = 1;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i] = Math.max(dp[i],1+dp[j]);
                }
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}