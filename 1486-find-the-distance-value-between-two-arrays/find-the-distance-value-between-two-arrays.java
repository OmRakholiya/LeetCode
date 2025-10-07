class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        for(int i=0;i<arr1.length;i++){
            boolean isvalid=true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    isvalid=false;
                    break;
                }
            }
            if(isvalid){
                count++;
            }
        }
        return count;
    }
}

// class Solution {
//     public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
//         Arrays.sort(arr2);
//         int count=0;
//         for(int i=0;i<arr1.length;i++){
//             int l=0;
//             int r=arr2.length-1;
//             while(l<=r){
//                 int mid=l+(r-l)/2;
//                 if(Math.abs(arr1[i]+arr2[mid])<=d){
//                     l=mid+1;
//                 }
//                 else{
//                     r=mid-1;
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }