class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev = n & 1;
        n = n >> 1;
        while(n>0){
            int curr = n & 1;

            if(curr == prev){
                return false;
            }
            prev = curr;
            n = n >> 1;
        }
        return true;
    }
}



// class Solution {
//     public boolean hasAlternatingBits(int n) {
//         String binary = Integer.toBinaryString(n);

//         for(int i=1;i<binary.length();i++){
//             if(binary.charAt(i)==binary.charAt(i-1)){
//                 return false;
//             }
//         }
//         return true;
//     }
// }