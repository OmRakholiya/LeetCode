class Solution {
    public int[] searchRange(int[] nums, int target) {
       int res[]={-1,-1};
       res[0]=first(nums,target);
       res[1]=second(nums,target);
       return res;
    }
    public int first(int[] nums,int target){
        int index=-1;
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(target==nums[mid]){
                index=mid;
                r=mid-1;
                }
            else if(target>nums[mid])
                l=mid+1;
            else
                r=mid-1;
        }return index;

    }
    public int second(int[] nums,int target){
        int index=-1;
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(target==nums[mid]){
                index=mid;
                l=mid+1;
                }
            else if(target>nums[mid])
                l=mid+1;
            else
                r=mid-1;
        }return index;
    }

}