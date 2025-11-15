// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         for(int i=0;i<nums.length;i++){
//             int sum = nums[i];
//             for(int j=i+1;j<nums.length;j++){
//                 sum+=nums[j];
//                 if(sum%k==0) return true;
//             }
//         }return false;
//     }
// }


// class Solution {
//     public boolean checkSubarraySum(int[] nums, int k) {
//         int n=nums.length;
//         int[] prefix=new int[n+1];

//         for(int i=0;i<n;i++){
//             prefix[i+1] = prefix[i] + nums[i];
//         }

//         for(int i=0;i<n;i++){
//             for(int j=i+2;j<=n;j++){
//                 int sum = prefix[j]-prefix[i];
//                 if(sum%k == 0) return true;
//             }
//         }return false;
//     }
// }


class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefix=0;

        for(int i=0;i<nums.length;i++){
            prefix += nums[i];
            int mod = prefix % k;

            if(map.containsKey(mod)){
                if(i - map.get(mod) >=2){
                    return true;
                }
            }
            else{
                map.put(mod,i);
            }
        }return false;
    }
}
