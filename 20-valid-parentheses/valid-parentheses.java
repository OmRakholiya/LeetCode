// class Solution {
//     public boolean isValid(String s) {
//         while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
//             s = s.replace("()", "")
//                  .replace("{}", "")
//                  .replace("[]", "");
//         }
//         return s.isEmpty();
//     }
// }


class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;
        for(char c:s.toCharArray()){
            if(c=='('  || c=='{'  || c=='['){
                stack[++top] = c;
            }
            else{
                if(top==-1)  return false;
                char open = stack[top--];
                if((c==')' && open!='(') || (c=='}'&& open!='{') || (c==']' && open!='[')){
                    return false;
                }
            }
        }return top==-1;
    }
}

// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         for(char c:s.toCharArray()){
//             if(c=='(' || c=='{' || c=='['){
//                 stack.push(c);
//             }
//             else{
//                 if(stack.isEmpty()){
//                     return false;
//                 }
//                 char top = stack.pop();
//                 if((c==')' && top!='(') || (c=='}'&& top!='{') || (c==']' && top!='[')){
//                     return false;
//                 }
//             }
//         }return stack.isEmpty();
//     }
// }

// class Solution {
//     public boolean isValid(String s) {
//        Map<Character, Character> map = new HashMap<>();
//         map.put(')', '(');
//         map.put('}', '{');
//         map.put(']', '[');

//         Stack<Character> stack = new Stack<>();

//         for (char c : s.toCharArray()) {
//             if (map.containsKey(c)) {
//                 char top = stack.isEmpty() ? '#' : stack.pop();
//                 if (top != map.get(c)) return false;
//             } else {
//                 stack.push(c);
//             }
//         }
//         return stack.isEmpty();
//     }
// }


