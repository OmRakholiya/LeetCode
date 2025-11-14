class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int dup=-1,missing=-1;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int i=1;i<=nums.length;i++){
            int freq=map.getOrDefault(i,0);
            if(freq==2) dup = i;
            if(freq==0) missing = i;
        }
        return new int[]{dup,missing};
    }
}