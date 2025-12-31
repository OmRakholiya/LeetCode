// class Solution {
//     public int maxOperations(int[] nums, int k) {
//         int count=0;
//         boolean[] used = new boolean[nums.length];
//         for(int i=0;i<nums.length;i++){
//             if(used[i]) continue;
//             for(int j=i+1;j<nums.length;j++){
//                 if(!used[j] && nums[i]+nums[j]==k){
//                     used[i]=true;
//                     used[j]=true;
//                     count++;
//                     break;
//                 }
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int l=0;
        int r=nums.length-1;
        while(l<r){
            if(nums[l]+nums[r] == k){
                count++;
                l++;
                r--;
            }
            else if(nums[l]+nums[r] < k){
                l++;
            }
            else{
                r--;
            }
        }
        return count;
    }
}