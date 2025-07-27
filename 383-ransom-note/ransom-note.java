class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char []r = ransomNote.toCharArray();
        char []m = magazine.toCharArray();
        Arrays.sort(r);
        Arrays.sort(m);
        int i=0,j=0;
        while(i<r.length  && j<m.length){
            if(r[i]==m[j]){
                i++;
                j++;
            }
            else if(r[i]>m[j]){
                j++;
            }
            else{
                return false;
            }
        }
        return i==r.length;
    }
}

// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         char []ransom = ransomNote.toCharArray();
//         char []magaz = magazine.toCharArray();
//         Arrays.sort(ransom);
//         Arrays.sort(magaz);
//         for(int i=0;i<ransomNote.length();i++){
//             if(ransom[i]!=magaz[i]){
//                 return false;
//             }
//         }return true;
//     }
// }