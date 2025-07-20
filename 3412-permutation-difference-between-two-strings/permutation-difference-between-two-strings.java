class Solution {
    public int findPermutationDifference(String s, String t) {
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        int sum=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                if(s1[i]==s2[j]){
                    sum+=Math.abs(i-j);
                    break;
                }
            }
        }return sum;
    }
}