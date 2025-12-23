// class Solution {
//     public void moveZeroes(int[] nums) {
//         int index=0;
//         for(int num : nums){
//             if(num != 0){
//                 nums[index]=num;
//                 index++;
//             }
//         }
//         while(index<nums.length){
//             nums[index]=0;
//             index++;
//         }
//     }
// }

class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int tem = nums[lastNonZero];
                nums[lastNonZero] = nums[i];
                nums[i] = tem;

                lastNonZero++;
            }
        }
    }
}