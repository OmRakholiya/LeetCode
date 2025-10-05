class Solution {
    public int maxSubArray(int[] nums) {
        int curr=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            curr=Math.max(nums[i],curr+nums[i]);
            max=Math.max(max,curr);
        }
        return max;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){                    
//                     sum+=nums[k];
//                 }
//                 maxsum=Math.max(maxsum,sum);
//             }
//         }return maxsum;
//     }
// }