// class Solution {
//     public int longestConsecutive(int[] nums) {

//         if(nums.length == 0) return 0;
//         Arrays.sort(nums);
//         int longest = 1;
//         int count = 1;

//         for(int i=1;i<nums.length;i++){
//             if(nums[i]==nums[i-1]){
//                 continue;
//             }
//             else if(nums[i]==nums[i-1]+1){
//                 count++;
//             }
//             else{
//                 count=1;
//             }
//             longest=Math.max(longest,count);
//         }
//         return longest;
//     }
// }


// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length==0) return 0;
//         Arrays.sort(nums);
//         int lastsmaller=Integer.MIN_VALUE;
//         int longest=1;
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]-1==lastsmaller){
//                 count++;
//                 lastsmaller=nums[i];
//             }
//             else if(lastsmaller!=nums[i]){
//                 count=1;
//                 lastsmaller=nums[i];
//             }
//             longest=Math.max(longest,count);
//         }
//         return longest;
//     }
// }



class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest=0;
        for(int num : set){
            if(!set.contains(num-1)){
                int current = num;
                int count = 1;
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
