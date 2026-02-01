// class Solution {
//     public int minimumCost(int[] nums) {
//         int ans = Integer.MAX_VALUE;

//         for(int i=1;i<nums.length-1;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 int cost = nums[0]+nums[i]+nums[j];
//                 ans = Math.min(ans,cost);
//             }
//         }
//         return ans;
//     }
// }



class Solution {
    public int minimumCost(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<first){
                second=first;
                first=nums[i];
            }
            else if(nums[i]<second){
                second=nums[i];
            }
        }
        return nums[0]+first+second;
    }
}