// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int l=1;
//         int r=arr.length-2;
//         while(l<=r){
//             int mid=l+(r-l)/2;
//             if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
//                 return mid;
//             }
//             else if(arr[mid]>arr[mid-1]){
//                 l=mid+1;
//             }
//             else{
//                 r=mid-1;
//             }
//         }
//         return 0;
//     }
// }


class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int mid=l+(r-l)/2;

            if(arr[mid] < arr[mid+1]){
                l=mid+1;
            }
            else{
                r=mid;
            }
        }
        return l;
    }
}


// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int n=arr.length;
//         for(int i=0;i<n;i++){
//             if((i==0 || arr[i-1]<arr[i]) && ((i==n-1) || arr[i]>arr[i+1])){
//                 return i;
//             }
//         }
//         return 0;
//     }
// }