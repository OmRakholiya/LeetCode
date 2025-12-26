// class Solution {
//     public boolean isBalanced(String num) {
//         char[] arr = num.toCharArray();
//         int sumofeven=0;
//         int sumofodd=0;
//         for(int i=0;i<arr.length;i++){
//             if(i%2==0){
//                 sumofeven+=arr[i]-'0';
//             }
//             if(i%2!=0){
//                 sumofodd+=arr[i]-'0';
//             } 
//         }
//         return sumofeven==sumofodd;
//     }
// }

class Solution {
    public boolean isBalanced(String num) {
        int sumofeven=0;
        int sumofodd=0;
        for(int i=0;i<num.length();i++){
            if((i&1)==0){
                sumofeven+=num.charAt(i)-'0';
            }
            else{
                sumofodd+=num.charAt(i)-'0';
            } 
        }
        return sumofeven==sumofodd;
    }
}