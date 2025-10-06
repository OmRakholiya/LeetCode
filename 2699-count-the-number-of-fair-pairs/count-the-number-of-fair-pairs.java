// class Solution {
//     public long countFairPairs(int[] nums, int lower, int upper) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 int sum=nums[i]+nums[j];
//                 if(lower <= sum  && sum<= upper){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums,upper) - countPairs(nums,lower-1);
    }
    public long countPairs(int[] nums,long val){
        int l=0;
        int r=nums.length-1;
        long count=0;
        while(l<r){
            if((long)nums[l]+nums[r]<=val){
                count+=(r-l);
                l++;
            }
            else{
                r--;
            }
        }
        return count;
    }
}