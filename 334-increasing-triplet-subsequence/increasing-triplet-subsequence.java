// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[j] > nums[i]){
//                     for(int k=j+1;k<n;k++){
//                         if(nums[k]>nums[j]){
//                             return true;
//                         }
//                     }
//                 }
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
