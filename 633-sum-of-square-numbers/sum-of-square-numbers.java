// class Solution {
//     public boolean judgeSquareSum(int c) {
//         for(long i=0;i*i<=c;i++){
//             long j=c-i*i;
//             long sqrtj = (long)Math.sqrt(j);
//             if(sqrtj*sqrtj == j){
//                 return true;
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean judgeSquareSum(int c) {
        long l=0;
        long r=(long)Math.sqrt(c);
        while(l<=r){
            long sum = l*l + r*r;
            if(sum==c)  return true;
            else if(sum<c)  l++;
            else r--;
        }
        return false;
    }
}