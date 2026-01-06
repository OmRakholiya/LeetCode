// class Solution {
//     public List<Integer> findDisappearedNumbers(int[] nums) {
//         Set<Integer> seen=new HashSet<>();
//         for(int num:nums){
//             seen.add(num);
//         }
//         List<Integer> res=new ArrayList<>();
//         for(int i=1;i<=nums.length;i++){
//             if(!seen.contains(i)){
//                 res.add(i);
//             }
//         }return res;
//     }
// }



class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]>0){
                nums[idx]= -nums[idx];
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }return ans;
    }
}



