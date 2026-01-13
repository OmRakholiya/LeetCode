// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//        int res[]={-1,-1};
//        res[0]=first(nums,target);
//        res[1]=second(nums,target);
//        return res;
//     }
//     public int first(int[] nums,int target){
//         int index=-1;
//         int l=0,r=nums.length-1;
//         while(l<=r){
//             int mid=(l+r)/2;
//             if(target==nums[mid]){
//                 index=mid;
//                 r=mid-1;
//                 }
//             else if(target>nums[mid])
//                 l=mid+1;
//             else
//                 r=mid-1;
//         }return index;

//     }
//     public int second(int[] nums,int target){
//         int index=-1;
//         int l=0,r=nums.length-1;
//         while(l<=r){
//             int mid=(l+r)/2;
//             if(target==nums[mid]){
//                 index=mid;
//                 l=mid+1;
//                 }
//             else if(target>nums[mid])
//                 l=mid+1;
//             else
//                 r=mid-1;
//         }return index;
//     }

// }





// class Solution {
//     public int[] searchRange(int[] nums, int target) {
//         int first = -1, last = -1;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 if (first == -1) first = i;
//                 last = i;
//             }
//         }
//         return new int[]{first, last};
//     }
// }




class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        int idx = -1;

        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]==target){
                idx=mid;
                break;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        if(idx == -1) return new int[]{-1,-1};

        int left=idx;
        int right=idx;

        while(left-1 >= 0 && nums[left-1] == target) left--;
        while(right+1 < n && nums[right+1] == target) right++;

        return new int[]{left,right};
    }
}
