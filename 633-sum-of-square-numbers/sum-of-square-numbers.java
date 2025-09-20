class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i=0;i*i<=c;i++){
            long j=c-i*i;
            long sqrtj = (long)Math.sqrt(j);
            if(sqrtj*sqrtj == j){
                return true;
            }
        }
        return false;
    }
}