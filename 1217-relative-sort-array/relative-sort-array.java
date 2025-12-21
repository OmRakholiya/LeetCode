// class Solution {
//     public int[] relativeSortArray(int[] arr1, int[] arr2) {
//         ArrayList<Integer> l = new ArrayList<>();
//         for(int x : arr2){
//             for(int i=0;i<arr1.length;i++){
//                 if(arr1[i]==x){
//                     l.add(arr1[i]);
//                     arr1[i]=-1;
//                 }
//             }
//         }
//         Arrays.sort(arr1);
//         for(int x:arr1){
//             if(x!=-1){
//                 l.add(x);
//             }
//         }

//         int[] result = new int[l.size()];
//         for(int i=0;i<l.size();i++){
//             result[i]=l.get(i);
//         }
//         return result;
//     }
// }


class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int x:arr1){
            count[x]++;
        }
        int[] res = new int[arr1.length];
        int index=0;

        for(int x : arr2){
            while(count[x]-- > 0){
                res[index]=x;
                index++;
            }
        }

        for(int i=0;i<count.length;i++){
            while(count[i]-- >0){
                res[index]=i;
                index++;
            }
        }
        return res;
    }
}