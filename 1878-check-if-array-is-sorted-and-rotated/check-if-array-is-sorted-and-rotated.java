// class Solution {
//     public boolean check(int[] nums) {
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]>nums[i+1]){
//                 int first = nums[i+1];
//                 for(int j=first;j<nums.length-1;j++){
//                     if(nums[j]<nums[j+1]){
//                         continue;
//                     }
//                 }
//                 if(nums[nums.length-1]>nums[0]){
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
// }



class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                count++;
            }
        }
        if(count > 1) return false;
        return true;
    }
}