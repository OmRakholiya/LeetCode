// class Solution {
//     public int[] findErrorNums(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int dup=-1,missing=-1;
//         for(int num : nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//         }
//         for(int i=1;i<=nums.length;i++){
//             int freq=map.getOrDefault(i,0);
//             if(freq==2) dup = i;
//             if(freq==0) missing = i;
//         }
//         return new int[]{dup,missing};
//     }
// }   

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int dup = -1;
        int sum = 0;

        for (int num : nums) {
            if (set.contains(num)) dup = num;
            else set.add(num);
            sum += num;
        }

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;

        int missing = expectedSum - (sum - dup);
        return new int[]{dup, missing};
    }
}
