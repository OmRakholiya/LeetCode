// class Solution {
//     public int countSegments(String s) {
//         if(s==null || s.trim().isEmpty())   return 0;
//         return s.trim().split("\\s+").length;
//     }
// }
import java.util.StringTokenizer;
class Solution {
    public int countSegments(String s) {
        StringTokenizer st = new StringTokenizer(s);
        return st.countTokens();
    }
}