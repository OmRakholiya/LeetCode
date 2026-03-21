// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         List<Integer> l1=new ArrayList<>();
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=0;j<n;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count>n/3 && !l1.contains(nums[i])){
//                 l1.add(nums[i]);
//             }
//         }return l1;
//     }
// }


class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> res=new ArrayList<>();
        int n = nums.length;
        int mini = n/3+1;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])==mini){
                res.add(nums[i]);
            }
            if(res.size()==2){
                break;
            }
        }return res;
    }
}