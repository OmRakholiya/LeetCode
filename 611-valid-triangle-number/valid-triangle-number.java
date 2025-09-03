// class Solution {
//     public int triangleNumber(int[] nums) {
//         int count=0;
//         int n=nums.length;
//         Arrays.sort(nums);
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 for(int k=j+1;k<n;k++){
//                     if(nums[i]+nums[j]>nums[k]){
//                         count++;
//                     }
//                 }
//             }
//         }return count;
//     }
// }

// class Solution {
//     public int triangleNumber(int[] nums) {
//         int count=0;
//         int n=nums.length;
//         Arrays.sort(nums);
//         for(int i=0;i<n-2;i++){
//             for(int j=i+1;j<n-1;j++){
//                 int l=j+1;
//                 int r=n-1;
//                 int k=j;
//                 while(l<=r){
//                     int mid=l+(r-l)/2;
//                     if(nums[i]+nums[j]>nums[mid]){
//                         k=mid;
//                         l=mid+1;
//                     }
//                     else{
//                         r=mid-1;
//                     }
//                 }count+=(k-j);
//             }
//         }return count;
//     }
// }

class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int k=n-1;k>=2;k--){
               int i=0;
               int j=k-1;
                while(i<j){
                    if(nums[i]+nums[j]>nums[k]){
                       count+=(j-i);
                       j--;
                    }
                    else{
                        i++;
                    }
                }
        }return count;
    }
}