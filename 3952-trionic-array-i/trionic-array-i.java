// class Solution {
//     public boolean isTrionic(int[] nums) {
//     int n =  nums.length;
//     int i=0;
//     while(i+1<n && nums[i]<nums[i+1]){
//         i++;        
//     }
//     if(i==0) return false;

//     while(i+1<n && nums[i]>nums[i+1]){
//         i++;
//     }
//     if(i==n-1) return false;

//     while(i+1<n && nums[i]<nums[i+1]){
//         i++;
//     }
//     return i==n-1;
//     }
// }


class Solution {
    public boolean isTrionic(int[] nums) {
        int n= nums.length;
        for(int p=1;p<=n-3;p++){
            for(int q=p+1;q<=n-2;q++){
                boolean found = true;
                for(int i=0;i<p;i++){
                    if(nums[i]>=nums[i+1]){
                        found=false;
                        break;
                    }
                }
                for(int i=p;i<q && found;i++){
                    if(nums[i]<=nums[i+1]){
                        found=false;
                        break;
                    }
                }
                for(int i=q;i<n-1 && found;i++){
                    if(nums[i]>=nums[i+1]){
                        found=false;
                        break;
                    }
                }
                if(found) return true;
            }
        }
        return false;
    }
}