// class Solution {
//     public int maxSubArray(int[] nums) {
//         int curr=nums[0];
//         int max=nums[0];
//         for(int i=1;i<nums.length;i++){
//             curr=Math.max(nums[i],curr+nums[i]);
//             max=Math.max(max,curr);
//         }
//         return max;
//     }
// }


class Solution {
    public int maxSubArray(int[] nums) {
        int currSum=0;
        int maxSum=nums[0];
        for(int num : nums){
            currSum += num;
            maxSum=Math.max(maxSum,currSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int maxsum=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int sum=0; 
//             for(int j=i;j<nums.length;j++){      
//                 sum+=nums[j];
//                 maxsum=Math.max(maxsum,sum);
//             }
//         }return maxsum;
//     }
// }

