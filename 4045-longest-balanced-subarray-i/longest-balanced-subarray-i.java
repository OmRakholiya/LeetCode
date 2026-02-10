// class Solution {
//     public int longestBalanced(int[] nums) {
//         int maxLen=0;
//         for(int i=0;i<nums.length;i++){
//             Set<Integer> even = new HashSet<>();
//             Set<Integer> odd = new HashSet<>();

//             for(int j=i;j<nums.length;j++){
//                 if(nums[j]%2==0){
//                     even.add(nums[j]);
//                 }
//                 else{
//                     odd.add(nums[j]);
//                 }
//                 if(even.size() == odd.size()){
//                     maxLen = Math.max(maxLen , j-i+1);
//                 }
//             }
//         }
//         return maxLen;
//     }
// }



class Solution {
    public int longestBalanced(int[] nums) {
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            Map<Integer,Integer> even = new HashMap<>();
            Map<Integer,Integer> odd = new HashMap<>();

            for(int j=i;j<nums.length;j++){
                if(nums[j]%2==0){
                    even.put(nums[j],even.getOrDefault(nums[j],0)+1);
                }
                else{
                    odd.put(nums[j],odd.getOrDefault(nums[j],0)+1);
                }
                if(even.size() == odd.size()){
                    maxLen = Math.max(maxLen , j-i+1);
                }
            }
        }
        return maxLen;
    }
}