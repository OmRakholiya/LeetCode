/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         for (int i = 1; i <= n; i++) {
//             if(isBadVersion(i)) return i;
//         }return -1;
//     }
// }

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
//         int l=1;
//         int r=n;
//         while(l<r){
//             int mid=l+(r-l)/2;
//             if(isBadVersion(mid)){
//                 r=mid;
//             }
//             else{
//                 l=mid+1;
//             }
//         }return l;
//     }
// }

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        return binarysearch(1,n);
    }
    public int binarysearch(int l,int r){
        if(l==r)   return l;
        int mid=l+(r-l)/2;
        if(isBadVersion(mid)){
            return binarysearch(l,mid);
        }
        else{
            return binarysearch(mid+1,r);
        }
    }
}