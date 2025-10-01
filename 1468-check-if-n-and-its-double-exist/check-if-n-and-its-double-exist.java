// class Solution {
//     public boolean checkIfExist(int[] arr) {
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 if(i!=j && arr[i] == 2 * arr[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }
import java.util.Arrays;
class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int target = 2*arr[i];
            int index=Arrays.binarySearch(arr,target);
            if(index>=0 && index!=i){
                return true;
            }
        }
        return false;
    }

}