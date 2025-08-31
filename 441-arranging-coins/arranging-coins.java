// class Solution {
//     public int arrangeCoins(int n) {
//         int row=0;
//         while(n>=row+1){
//             row++;
//             n-=row;
//         }
//         return row;
//     }
// }

class Solution {
    public int arrangeCoins(int n) {
        long l = 0, r = n;  
        while (l <= r) {
            long mid = l + (r - l) / 2;
            long coins = mid * (mid + 1) / 2;

            if (coins == n) {
                return (int) mid;
            } else if (coins < n) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return (int) r; 
    }
}

// class Solution {
//     public int arrangeCoins(int n) {
//         return (int)((Math.sqrt(1 + 8L * n) - 1) / 2);
//     }
// }