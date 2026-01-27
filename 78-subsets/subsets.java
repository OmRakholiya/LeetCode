// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         List<List<Integer>> res = new ArrayList<>();
//         int n=nums.length;

//         if(n>=0) res.add(new ArrayList<>());
//         if(n>=1) res.add(Arrays.asList(nums[0]));
//         if(n>=2) res.add(Arrays.asList(nums[1]));
//         if(n>=2) res.add(Arrays.asList(nums[0],nums[1]));
//         if(n>=3) res.add(Arrays.asList(nums[2]));
//         if(n>=3) res.add(Arrays.asList(nums[0],nums[2]));
//         if(n>=3) res.add(Arrays.asList(nums[1],nums[2]));
//         if(n>=3) res.add(Arrays.asList(nums[0],nums[1],nums[2]));

//         return res;
//     }
// }


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;

        for(int mask=0; mask<(1<<n); mask++){
            List<Integer> subset = new ArrayList<>();

            for(int i=0;i<n;i++){
                if((mask & (1 << i)) != 0){
                    subset.add(nums[i]);
                }
            }
            res.add(subset);
        }
        return res;
    }
}