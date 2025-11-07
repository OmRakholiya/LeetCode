// class Solution {
//     public boolean isHappy(int n) {
//        int slow=n;
//        int fast=n;
//        while(slow!=fast){
//         slow=squre(slow);
//         fast=squre(squre(fast));
//        }
//        return slow==1;
//     }
//     public int squre(int num){
//         int ans=0;
//         while(num>0){
//             int r=num%10;
//             ans+=r*r;
//             num/=10;
//         }return ans;
//     }
// }

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=squre(n); 
        }
        return n==1;
    }
    public int squre(int num){
        int ans=0;
        while(num>0){
            int digit=num%10;
            ans+=digit*digit;
            num/=10;
        }return ans;
    }
}