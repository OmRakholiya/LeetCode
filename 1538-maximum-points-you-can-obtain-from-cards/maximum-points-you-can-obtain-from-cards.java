// class Solution {
//     public int maxScore(int[] cardPoints, int k) {
//         int lsum=0;
//         int rsum=0;
//         int maxSum=0;
//         int n= cardPoints.length;
//         for(int i=0;i<k;i++){
//             lsum+=cardPoints[i];
//         }
//         maxSum=lsum;
        
//         int rightIdx=n-1;
//         for(int i=k-1;i>=0;i--){
//             lsum -= cardPoints[i];
//             rsum += cardPoints[rightIdx];
//             rightIdx--;
//             maxSum = Math.max(maxSum,lsum+rsum);
//         }
//         return maxSum;
//     }
// }


class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int[] l = new int[k+1];
        int[] r = new int[k+1];
        int n = cardPoints.length;

        for(int i=1;i<=k;i++){
            l[i] = l[i-1]+cardPoints[i-1];
            r[i] = r[i-1]+cardPoints[n-i];
        }

        int max=0;
        for(int i=0;i<=k;i++){
            max=Math.max(max,l[i]+r[k-i]);
        }
        return max;
    }
}