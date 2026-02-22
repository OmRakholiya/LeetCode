// class Solution {
//     public int binaryGap(int n) {
//         if(Integer.bitCount(n)==1) return 0;
//         String binary = Integer.toBinaryString(n);
//         int maxdiff = 0;
//         int lastIdx = -1;

//         for(int i=0;i<binary.length();i++){
//             if(binary.charAt(i)=='1'){
//                 if(lastIdx != -1){
//                     int diff = i - lastIdx;
//                     maxdiff = Math.max(maxdiff , diff);
//                 }
//                 lastIdx = i;
//             }
//         }
//         return maxdiff;
//     }
// }




// class Solution {
//     public int binaryGap(int n) {
//         if(Integer.bitCount(n)==1) return 0;
//         String binary = Integer.toBinaryString(n);
//         List<Integer> list = new ArrayList<>();

//         for(int i=0;i<binary.length();i++){
//             if(binary.charAt(i)=='1'){
//                 list.add(i);
//             }
//         }
//         int maxdiff = 0;

//         for(int i=1;i<list.size();i++){
//             maxdiff = Math.max(maxdiff , list.get(i)-list.get(i-1));
//         }
//         return maxdiff;
//     }
// }



class Solution {
    public int binaryGap(int n) {
        if(Integer.bitCount(n)==1) return 0;
        int lastpos = -1;
        int maxdiff = 0;
        int index = 0;
        
        while(n>0){
            if((n & 1) == 1){
                if(lastpos != -1){
                    maxdiff = Math.max(maxdiff , index - lastpos);
                }
                lastpos = index;
            }
            n = n >> 1;
            index++;
        }
        return maxdiff;
    }
}