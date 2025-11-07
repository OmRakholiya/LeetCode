// class Solution {
//     public int totalFruit(int[] fruits) {
//         int n=fruits.length;
//         int maxLen=0;
//         for(int i=0;i<n;i++){
//             HashSet<Integer> set = new HashSet<>();
//             for(int j=i;j<n;j++){
//                 set.add(fruits[j]);
//                 if(set.size()<=2){
//                     maxLen=Math.max(maxLen,j-i+1);
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }return maxLen;
//     }
// }

class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int maxLen=0;
        int l=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int r=0;r<n;r++){
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
            }     
            maxLen = Math.max(maxLen,r-l+1);       
        }return maxLen;
    }
}