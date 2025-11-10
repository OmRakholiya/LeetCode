// class Solution {
//     public boolean detectCapitalUse(String word) {
//         int upperCount =0;
//         for(char c: word.toCharArray()){
//             if(Character.isUpperCase(c)){
//                 upperCount++;
//             }
//         }
//         int n=word.length();
//         if(upperCount==n) return true;
//         if(upperCount==0) return true;
//         if(upperCount==1 && Character.isUpperCase(word.charAt(0))) return true;
//         return false;
//     }
// }


class Solution {
    public boolean detectCapitalUse(String word) {
         return word.equals(word.toUpperCase()) ||
               word.equals(word.toLowerCase()) ||
               word.equals(Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase());
    }
}

