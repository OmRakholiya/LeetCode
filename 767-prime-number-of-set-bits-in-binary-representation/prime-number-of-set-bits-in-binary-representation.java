class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res=0;

        for(int i = left; i <= right; i++){
            String binary = Integer.toBinaryString(i);

            int count = 0;
            for(int j=0; j<binary.length(); j++){
                if(binary.charAt(j)=='1'){
                    count++;
                }
            }
            if(isPrime(count)){
                res++;
            }
        }
        return res;
    }
    public boolean isPrime(int n){
        if (n <= 1) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}