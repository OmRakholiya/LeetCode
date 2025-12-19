class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    count++;
                }
            }
        }
        return count;
    }
}


// class Solution {
//     public int countPairs(List<Integer> nums, int target) {
//         int[] arr = new int[nums.size()];
//         for (int i = 0; i < nums.size(); i++) {
//             arr[i] = nums.get(i);
//         }
//         Arrays.sort(arr);
//         int i=0;
//         int j=arr.length-1;
//         int count=0;
//         while(i<j){
//             if(arr[i] + arr[j] < target){
//                 count+=(j-i);
//                 i++;
//             }
//             else{
//                 j--;
//             }
//         }
//         return count;
//     }
// }
