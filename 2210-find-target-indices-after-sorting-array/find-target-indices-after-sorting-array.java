// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) {
//         Arrays.sort(nums);
//         ArrayList<Integer> l = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target){
//                 l.add(i);
//             }
//         }
//         return l;
//     }
// }

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int countless=0;
        int countequal=0;
        for(int num : nums){
            if(num<target)   countless++;
            else if(num==target)   countequal++;
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<countequal;i++){
            l.add(countless + i);
        }
        return l;
    }
}