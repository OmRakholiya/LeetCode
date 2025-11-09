// class Solution {
//     public int longestPalindrome(String s) {
//         Map<Character,Integer> map = new HashMap<>();
//         for(char c:s.toCharArray()){
//             map.put(c,map.getOrDefault(c,0)+1);
//         }
//         int len=0;
//         boolean found=false;
//         for(int count : map.values()){
//             if(count%2==0){
//                 len+=count;
//             }
//             else{
//                 len+=count-1;
//                 found=true;
//             }
//         }
//         if(found) len+=1;
//         return len;
//     }
// }

class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int len=0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                len+=2;
            }
            else{
                set.add(c);
            }
        }
        if(!set.isEmpty())  len+=1;
        return len;
    }
}