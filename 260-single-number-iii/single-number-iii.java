class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int[] arr = new int[2];
        int idx=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                arr[idx]=nums[i];
                idx++;
                if(idx==2)break;
            }
        }
        return arr;
    }
}