// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int[] ans = new int[2*n];
//         for(int i=0;i<n;i++){
//             ans[2*i]=nums[i];
//             ans[2*i+1]=nums[i+n];
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int idx=0;
        for(int i=0;i<n;i++){
            ans[idx++]=nums[i];
            ans[idx++]=nums[i+n];
        }
        return ans;
    }
}