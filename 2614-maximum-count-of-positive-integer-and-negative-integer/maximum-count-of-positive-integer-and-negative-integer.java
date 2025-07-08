class Solution {
    public int maximumCount(int[] nums) {
        int countp=0;
        int countn=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                countn++;
            }
            if(nums[i]>0){
                countp++;
            }
        }
        if(countp>countn){
            return countp;
        }
        return countn;
    }
}