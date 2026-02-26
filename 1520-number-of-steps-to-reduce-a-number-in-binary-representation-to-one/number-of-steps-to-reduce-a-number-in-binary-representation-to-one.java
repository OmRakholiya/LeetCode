// class Solution {
//     public int numSteps(String s) {
//         long num = 0;
//         for(int i=0;i<s.length();i++){
//             num = num*2 + (s.charAt(i)-'0');
//         }
//         int count = 0;
//         while(num!=1){
//             if(num%2==0){
//                 num = num/2;
//                 count++;
//             }
//             else{
//                 num += 1;
//                 count++;
//             }
//         }
//         return count;
//     }
// }



class Solution {
    public int numSteps(String s) {
        int count = 0;
        int carry = 0;
        for(int i=s.length()-1;i>0;i--){
            int bit = s.charAt(i)-'0';
            if(bit+carry == 1){
                carry = 1;
                count += 2;
            }
            else{
                count += 1;
            }
        }
        return count+carry;
    }
}