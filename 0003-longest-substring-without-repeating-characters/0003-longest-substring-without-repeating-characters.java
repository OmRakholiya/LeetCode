    // class Solution {
    //     public int lengthOfLongestSubstring(String s) {
    //         int n=s.length();
    //         int maxLen=0;
    //         for(int i=0;i<n;i++){
    //             HashSet<Character> set = new HashSet<>(); 
    //             for(int j=i;j<n;j++){
    //                 if(set.contains(s.charAt(j))){
    //                     break;
    //                 }
    //                 set.add(s.charAt(j));
    //                 maxLen=Math.max(maxLen,j-i+1);
    //             }
    //         }return maxLen;
    //     }
    // }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0;
        int r=0;
        int maxLen=0;
        HashSet<Character> set = new HashSet<>();
        while(r<n){
            char c = s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            maxLen=Math.max(maxLen,r-l+1);
            r++;
        }return maxLen;
    }
}