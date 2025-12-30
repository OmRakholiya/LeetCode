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
        int n = nums.length;
        if (n < 3) return false;

        int[] leftMin = new int[n];
        int[] rightMax = new int[n];

        leftMin[0] = nums[0];
        for (int i = 1; i < n; i++) {
            leftMin[i] = Math.min(leftMin[i - 1], nums[i]);
        }

        rightMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i]);
        }

        for (int j = 1; j < n - 1; j++) {
            if (leftMin[j - 1] < nums[j] && nums[j] < rightMax[j + 1]) {
                return true;
            }
        }
        return false;
    }
}


// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         int first = Integer.MAX_VALUE;
//         int second = Integer.MAX_VALUE;

//         for (int num : nums) {
//             if (num <= first) {
//                 first = num;
//             } else if (num <= second) {
//                 second = num;
//             } else {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
