class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        int i=0,j=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]==s2[j]){
                i++;
            }
            j++;
        }return i==s1.length;
    }
}

    // char[] s1 = s.toCharArray();
    //     char[] s2 = t.toCharArray();
    //     for(int i=0;i<s.length();i++){
    //         for(int j=0;j<t.length();j++){
    //             if(s1[i]!=s2[j]){
    //                 return false;
    //             }
    //         }
    //     }return false;