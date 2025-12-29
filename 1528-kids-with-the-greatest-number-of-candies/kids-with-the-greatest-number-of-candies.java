// class Solution {
//     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//         List<Boolean> list = new ArrayList<>();
//         int max=0;
//         for(int candy : candies){
//             max = Math.max(max,candy);
//         }
//         for(int i=0;i<candies.length;i++){
//             if(candies[i] + extraCandies >= max){
//                 list.add(true);
//             }
//             else{
//                 list.add(false);
//             }
            
//         }
//         return list;
//     }
// }


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            boolean isgretest = true;
            for(int j=0;j<candies.length;j++){
                if(candies[i]+extraCandies < candies[j]){
                    isgretest = false;
                    break;
                }
            }
            list.add(isgretest);
        }
        return list;
    }
}