// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     return new int[] {i,j};
//                 }
//             }
//         }return new int[]{};
//     }
// }


class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int found=target-nums[i];
            if(map.containsKey(found)){
                return new int[]{map.get(found),i};
            }
            map.put(nums[i],i);
        }return new int[]{};
    }
}



// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        int l=0;
//        int r=nums.length-1;
//        Arrays.sort(nums);
//         while(l<r){
//             int sum = nums[l]+nums[r];
//             if(sum==target){
//                 return new int[] {l,r};
//             }       
//             else if(sum<target)    l++;
//             else  r--;
//         }
//         return new int[]{};
//     }
// }