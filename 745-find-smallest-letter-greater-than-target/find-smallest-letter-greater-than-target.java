// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         Arrays.sort(letters);
//         for(char i=0;i<letters.length;i++){
//             if(letters[i]>target){
//                 return letters[i];
//             }
//         }
//         return letters[0];
//     }
// }

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char ch : letters){
            if(ch>target){
                return ch;
            }
        }
        return letters[0];
    }
}

// class Solution {
//     public char nextGreatestLetter(char[] letters, char target) {
//         int l=0;
//         int r = letters.length-1;
//         while(l<=r){
//             int mid=l+(r-l)/2;
//             if(letters[mid]<=target){
//                 l=mid+1;
//             }
//             else{
//                 r=mid-1;
//             }
//         }
//         return letters[l%letters.length];
//     }
// }

