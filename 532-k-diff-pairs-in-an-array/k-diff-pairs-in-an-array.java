class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0){
            return 0;
        }
        int count=0;
        Set<String> seen = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]-nums[i]==k){
                    String pair = nums[i]+","+nums[j];
                    if(!seen.contains(pair)){
                        seen.add(pair);
                        count++;
                    }
                    break;
                }
            }
        }
        return count;
    }
}


// class Solution {
//     public int findPairs(int[] nums, int k) {
//         if(k<0){
//             return 0;
//         }
//         Arrays.sort(nums);
//         int i=0;
//         int j=1;
//         int count=0;
//         while(i<nums.length && j<nums.length){
//             if(i==j || nums[j]-nums[i]<k){
//                 j++;                
//             }
//             else if(nums[j]-nums[i]>k){
//                 i++;
//             }
//             else{
//                 count++;
//                 i++;
//                 j++;
//                 while(j < nums.length && nums[j] == nums[j-1]) j++;
//             }
//         }
//         return count;
//     }
// }