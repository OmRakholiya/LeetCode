// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int n=nums.length;
//         Set<List<Integer>> set = new HashSet<>();
//         Arrays.sort(nums);
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(nums[i]+nums[j]+nums[k]==0){
//                         set.add(Arrays.asList(nums[i],nums[j],nums[k]));
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(set);
//     }
// }


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            Set<Integer> set =new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -nums[i]-nums[j];

                if(set.contains(third)){
                    res.add(Arrays.asList(nums[i],nums[j],third));
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }
}