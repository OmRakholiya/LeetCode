class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int len=0;
        boolean found=false;
        for(int count : map.values()){
            if(count%2==0){
                len+=count;
            }
            else{
                len+=count-1;
                found=true;
            }
        }
        if(found) len+=1;
        return len;
    }
}