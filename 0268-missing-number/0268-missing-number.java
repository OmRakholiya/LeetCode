// class Solution {
//     public int missingNumber(int[] nums) {
//         int n=nums.length;
//         int exp=n*(n+1)/2;
//         int sum=0;
//         for(int i=0;i<n;i++){
//             sum+=nums[i];
//         }
//         return exp-sum;
//     }
// }

// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=i){
//                 return i;
//             }
//         }
//         return nums.length;
//     }
// }

class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i))  return i;
        }
        return -1;
    }
}