class Solution {
    public int minimumDeletions(int[] nums) {
        int maxIdx = 0;
        int minIdx = 0;
        int n=nums.length;

        if(n==1) return 1;

        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[maxIdx]) maxIdx=i;
            if(nums[i]<nums[minIdx]) minIdx=i;
        }

        int left = Math.min(minIdx,maxIdx);
        int right = Math.max(minIdx,maxIdx);

        int removeFront = right+1;
        int removeBack = n-left;
        int removeBoth = (left+1)+(n-right);

        return Math.min(removeFront,Math.min(removeBack,removeBoth));
    }
}