// class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         Set<Integer> resultSet = new HashSet<>();  
//         for(int i=0;i<nums1.length;i++){
//             for(int j=0;j<nums2.length;j++){
//                 if(nums1[i]==nums2[j]){
//                     resultSet.add(nums1[i]);
//                     break;
//                 }
//             }
//         }
//         int[] result=new int[resultSet.size()];
//         int i=0;
//         for(int num : resultSet){
//             result[i++]=num;
//         }return result;
//     }
// }


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();  
        Set<Integer> set1 = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }
        for(int num : nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        int index = 0;
        for(int num : result){
            ans[index] = num;
            index++;
        }
        return ans;
    }
}