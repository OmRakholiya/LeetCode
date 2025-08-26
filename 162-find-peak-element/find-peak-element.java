// class Solution {
//     public int findPeakElement(int[] nums) {
//         int max=nums[0];
//         int ans =0;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i-1]<nums[i]){
//                 max = nums[i];
//                 ans=i;
//             }
//         }return ans;
//     }
// }

class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(nums[mid]<nums[mid+1]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }return l;
    }
}