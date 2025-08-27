class Solution {
    public boolean search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }return false;
    }
}

// class Solution {
//     public boolean search(int[] nums, int target) {
//         int l=0;
//         int r=nums.length-1;
//         while(l<r){
//             int mid=l+(r-l)/2;
//             if(nums[mid]==target){
//                 return true;
//             }
//             else if{
//                 r=mid-1;
//             }
//         }
//     }
// }