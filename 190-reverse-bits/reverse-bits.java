class Solution {
    public int reverseBits(int n) {
        if(n==0) return 0;
        int res = 0;
        for(int i=1;i<=32;i++){
            int lastBit = n & 1;
            res = res << 1;
            res = res | lastBit;
            n = n >> 1;
        }
        return res;
    }
}