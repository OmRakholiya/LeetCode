class Solution {
    public int minimumOperations(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int prev=0;
        for(int i=0;i<nums.length;i++){   
            if(nums[i]>0 && nums[i]!=prev){
                count++;
                prev=nums[i];
            } 
        }return count;
    }
}