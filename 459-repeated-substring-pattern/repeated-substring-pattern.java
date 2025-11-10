class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            if(n % i == 0){
                String sub = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                int repetCount=n/i;
                for(int j=0;j<repetCount;j++){
                    sb.append(sub);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }return false;
    }
}

// class Solution {
//     public boolean repeatedSubstringPattern(String s) {
//         String doubled = s + s;
//         return doubled.substring(1,doubled.length()-1).contains(s);
//     }
// }

// class Solution {
//     public boolean repeatedSubstringPattern(String s) {
//         return s.matches("(.+)\\1+");
//     }
// }