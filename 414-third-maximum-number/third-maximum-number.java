// class Solution {
//     public int thirdMax(int[] nums) {
//         Arrays.sort(nums);
//         int dis=1;
//         int n=nums.length;
//         for(int i=n-2;i>=0;i--){
//             if(nums[i]!=nums[i+1]){
//                 dis++;
//                 if(dis==3){
//                     return nums[i];
//                 }
//             }
//         } return nums[n-1];
//     }
// }

class Solution {
    public int thirdMax(int[] nums) {
        Integer f=null;
        Integer s=null;
        Integer t=null;
        for(int n:nums){
            if(f!=null && n==f || s!=null && n==s|| t!=null && n==t){
                continue;
            }  
            if(f==null || n>f){
                t=s;
                s=f;
                f=n;
            }
            else if(s==null || n>s){
                t=s;
                s=n;
            }
            else if(t==null || n>t){
                t=n;
            }
        }return (t==null) ? f : t;
    }
}