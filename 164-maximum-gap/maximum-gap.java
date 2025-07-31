class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        int maxgap=0;
        for(int i=0;i<nums.length-1;i++){
            int gap = nums[i+1]-nums[i];
            maxgap = Math.max(maxgap,gap);   
        }return maxgap;
    }
}