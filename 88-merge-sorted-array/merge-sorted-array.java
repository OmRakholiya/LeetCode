// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int[] combined = new int[nums1.length +nums2.length];
//         for(int i=0;i<n;i++){
//             nums1[m+i]=nums2[i];
//         }
//         Arrays.sort(nums1);
//     }    
// }


// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int l = m-1;
//         int r = 0;
//         while(l>=0 && r<n){
//             if(nums1[l] > nums2[r]){
//                 int tem = nums1[l];
//                 nums1[l] = nums2[r];
//                 nums2[r] = tem;
//                 l--;
//                 r++;
//             }
//             else{
//                 break;
//             }
//         }
//         Arrays.sort(nums1,0,m);
//         Arrays.sort(nums2,0,n);

//         for(int i=0;i<n;i++){
//             nums1[i+m] = nums2[i];
//         }
//     }    
// }




class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i>=0 && j >=0){
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else{
                nums1[k--] = nums2[j--];
            }
        }
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }    
}