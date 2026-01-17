// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int i=0,j=0;
//         while(i<s.length() && j<t.length()){
//             if(s.charAt(i)==t.charAt(j)){
//                 i++;
//             }
//             j++;
//         }return i==s.length();
//     }
// }

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        for(int j=0;j<t.length() && i<s.length();j++){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }return i==s.length();
    }
}

// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         char[] s1 = s.toCharArray();
//         char[] s2 = t.toCharArray();
//         int i=0,j=0;
//         while(i<s.length() && j<t.length()){
//             if(s1[i]==s2[j]){
//                 i++;
//             }
//             j++;
//         }return i==s1.length;
//     }
// }

        



// class Solution {
//     public boolean isSubsequence(String s, String t) {
//         int j=0;
//         for(int i=0;i<s.length();i++){
//             boolean found = false;
//             while(j<t.length()){
//                 if(s.charAt(i)==t.charAt(j)){
//                     found = true;
//                     j++;
//                     break;
//                 }
//                 j++;
//             }
//             if(!found) return false;
//         }
//         return true;
//     }
// }
