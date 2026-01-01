// class Solution {
//     public int maxVowels(String s, int k) {
//         int maxCount=0;

//         for(int i=0;i<=s.length()-k;i++){
//             int count=0;
//             for(int j=0;j<k;j++){
//                 int ch = s.charAt(i+j);
//                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                     count++;
//                 } 
//             }
//             maxCount = Math.max(maxCount , count);                       
//         }
//         return maxCount;        
//     }
// }


class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        int maxCount=0;
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(isvowel(ch)) count++;                
        }
        maxCount=count;
        for(int i=k;i<s.length();i++) {
            if(isvowel(s.charAt(i))) count++;
            if(isvowel(s.charAt(i-k))) count--;

            maxCount = Math.max(maxCount,count);
        }    
        return maxCount;   
    }
    public boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}