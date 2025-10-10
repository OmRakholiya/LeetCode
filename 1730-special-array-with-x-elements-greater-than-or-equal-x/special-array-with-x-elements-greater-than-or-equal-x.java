// class Solution {
//     public int specialArray(int[] nums) {
//         for(int x=0;x<=nums.length;x++){
//             int count=0;
//             for(int num : nums){
//                 if(num>=x){
//                     count++;
//                 }
//             }
//             if(count==x){
//                 return x;
//             }
//         }
//         return -1;
//     }
// }

class Solution {
    public int specialArray(int[] nums) {
            int l=0;
            int r=nums.length;
            while(l<=r){
                int mid=l+(r-l)/2;
                int count=0;
                for(int num:nums){
                    if(num>=mid){
                        count++;
                    }
                }
                if(count==mid){
                    return mid;
                }
                else if(count>mid){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            return -1;
    }
}