// class Solution {
//     public String reverseWords(String s) {
//         String res = "";
//         String[] words = s.split(" ");
//         for(int i=0;i<words.length;i++){
//             String rev = "";
//             for(int j=words[i].length()-1;j>=0;j--){
//                 rev += words[i].charAt(j);
//             }
//             res += rev;
//             if(i!=words.length-1){
//                 res += " ";
//             }
//         }
//         return res;
//     }
// }



    // class Solution {
    //     public String reverseWords(String s) {
    //         StringBuilder res = new StringBuilder();
    //         String[] words = s.split(" ");

    //         for(int i=0;i<words.length;i++){
    //             StringBuilder sb = new StringBuilder(words[i]);
    //             res.append(sb.reverse());
                
    //             if(i!=words.length-1){
    //                 res.append(" ");
    //             }
    //         }
    //         return res.toString();
    //     }
    // }


class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int start=0;
        for(int end=0;end<=arr.length;end++){
            if(end == arr.length || arr[end] == ' '){
                reverse(arr,start,end-1);
                start=end+1;
            }
        }
        return  new String(arr);
    }
    private void reverse(char[] arr,int l,int r){
        while(l<r){
            char tem = arr[l];
            arr[l] = arr[r];
            arr[r] = tem;
            l++;
            r--;
        }
    }
}