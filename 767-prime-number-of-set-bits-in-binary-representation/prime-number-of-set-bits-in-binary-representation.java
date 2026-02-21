// class Solution {
//     public int countPrimeSetBits(int left, int right) {
//         int res=0;

//         for(int i = left; i <= right; i++){
//             String binary = Integer.toBinaryString(i);

//             int count = 0;
//             for(int j=0; j<binary.length(); j++){
//                 if(binary.charAt(j)=='1'){
//                     count++;
//                 }
//             }
//             if(isPrime(count)){
//                 res++;
//             }
//         }
//         return res;
//     }
//     public boolean isPrime(int n){
//         if (n <= 1) return false;

//         for (int i = 2; i < n; i++) {
//             if (n % i == 0) return false;
//         }
//         return true;
//     }
// }




// class Solution {
//     public int countPrimeSetBits(int left, int right) {
//         int res=0;

//         for(int i = left; i <= right; i++){
//             String binary = Integer.toBinaryString(i);

//             int count = Integer.bitCount(i);
//             if(isPrime(count)){
//                 res++;
//             }
//         }
//         return res;
//     }
//     public boolean isPrime(int n){
//         if (n <= 1) return false;

//         for (int i = 2; i < n; i++) {
//             if (n % i == 0) return false;
//         }
//         return true;
//     }
// }


class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res=0;

        for(int i = left; i <= right; i++){
            int count = Integer.bitCount(i);

            if(count == 2 || count == 3 || count == 5 || 
               count == 7 || count == 11 || count == 13 || 
               count == 17 || count == 19)
               {
                res++;
               }

        }
        return res;
    }
}