// class Solution {
//     public int repeatedNTimes(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int num : nums){
//             if(set.contains(num)){
//                 return num;
//             }
//             set.add(num);
//         }
//         return -1;   
//     }
// }

class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        for(int gap=1; gap<=3; gap++){
            for(int i=0; i+gap<n; i++){
                if(nums[i]==nums[i+gap]){
                    return nums[i];
                }
            }          
        }  
        return -1;
    }
}