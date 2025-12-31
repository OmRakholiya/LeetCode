// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
//         double maxAvg = -Double.MAX_VALUE;
//         for(int i=0;i<=nums.length-k;i++){
//             int sum=0;
//             for(int j=i;j<i+k;j++){
//                 sum+=nums[j];
//             }
//             maxAvg = Math.max(maxAvg,(double)sum/k);
//         }
//         return maxAvg;
//     }
// }


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum = sum;
        for(int i=k;i<nums.length;i++){
            sum += nums[i]-nums[i-k];
            maxSum = Math.max(maxSum,sum);
        }
        return (double)maxSum/k;
    }
}
