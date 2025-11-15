// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> ans = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     ans.add(nums[i]);
//                 }
//             }
//         }
//         return ans;
//     }
// }

// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         List<Integer> ans = new ArrayList<>();
//         HashSet<Integer> set = new HashSet<>();
//         for(int num : nums){
//             if(set.contains(num)) ans.add(num);
//             else set.add(num);
//         }
//         return ans;
//     }
// }

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i])-1;

            if(nums[index]<0){
                ans.add(Math.abs(nums[i]));
            }else{
                nums[index]=-nums[index];
            }
        }return ans;
    }
}