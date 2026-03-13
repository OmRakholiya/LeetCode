class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int breakpoint = -1;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                breakpoint = i;
                break;
            }
        }
        if(breakpoint == -1) return true;
        for(int i=breakpoint+1;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                return false;
            }
        }
        return nums[n-1]<=nums[0];
    }
}



// class Solution {
//     public boolean check(int[] nums) {
//         int count = 0;
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             if(nums[i]>nums[(i+1)%n]){
//                 count++;
//             }
//         }
//         if(count > 1) return false;
//         return true;
//     }
// }