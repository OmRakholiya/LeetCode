class Solution {
    public void sortColors(int[] nums) {
       int l=0;
       int mid=0;
       int r=nums.length-1;
        while(mid<=r){
            if(nums[mid]==0){
                int tem=nums[l];
                nums[l]=nums[mid];
                nums[mid]=tem;
                l++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int tem=nums[mid];
                nums[mid]=nums[r];
                nums[r]=tem;
                r--;
            }
        }
    }
}

// class Solution {
//     public void sortColors(int[] nums) {
//         // Bubble Sort
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = 0; j < nums.length - i - 1; j++) {
//                 if (nums[j] > nums[j + 1]) {
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }
//     }
// }



// class Solution {
//     public void sortColors(int[] nums) {
//         int zero = 0, one = 0, two = 0;

//         // Count 0s, 1s, 2s
//         for (int num : nums) {
//             if (num == 0) zero++;
//             else if (num == 1) one++;
//             else two++;
//         }

//         // Overwrite the array
//         int index = 0;
//         for (int i = 0; i < zero; i++) nums[index++] = 0;
//         for (int i = 0; i < one; i++) nums[index++] = 1;
//         for (int i = 0; i < two; i++) nums[index++] = 2;
//     }
// }