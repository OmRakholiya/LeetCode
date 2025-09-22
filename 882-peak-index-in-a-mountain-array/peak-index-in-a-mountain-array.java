// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int l=0;
//         int r=arr.lenngth-1;
//         while(l<=r){
//             int mid=l+(r-l)/2;
//             if(mid)
//         }
//     }
// }


class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if((i==0 || arr[i-1]<arr[i]) && ((i==n-1) || arr[i]>arr[i+1])){
                return i;
            }
        }
        return 0;
    }
}