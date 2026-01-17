// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         ArrayList<Integer> l=new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             l.add(nums[i]);
//         }
//         for(int i=0;i<nums.length;i++){
//             l.add(nums[i]);
//         }
//         int[] ans = new int[l.size()];
//         for(int i=0;i<l.size();i++){
//             ans[i]=l.get(i);
//         }
//         return ans;
//     }
// }

// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int n=nums.length;
//         int[] ans = new int[2*n];
//         for(int i=0;i<n;i++){
//             ans[i]=nums[i];
//         }
//         for(int i=0;i<n;i++){
//             ans[i+n]=nums[i];
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}