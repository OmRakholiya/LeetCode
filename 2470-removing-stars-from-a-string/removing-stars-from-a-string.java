// class Solution {
//     public String removeStars(String s) {
//         StringBuilder sb = new StringBuilder(s);
//         while(sb.indexOf("*") != -1){
//             int startIndex = sb.indexOf("*");
//             sb.deleteCharAt(startIndex);
//             sb.deleteCharAt(startIndex-1);
//         }
//         return sb.toString();
//     }
// }


class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '*'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}


