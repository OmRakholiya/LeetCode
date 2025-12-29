// class Solution {
//     public int findGCD(int[] nums) {
//         Arrays.sort(nums);
//         int min=nums[0];
//         int gcd=1;
//         int max=nums[nums.length-1];

//         for(int i=1;i<=min;i++){
//             if(min %i == 0 & max % i == 0){
//                 gcd=i;
//             }
//         }
//         return gcd;
//     }
// }



// class Solution {
//     public int findGCD(int[] nums) {
//         int min=Integer.MAX_VALUE;
//         int max=Integer.MIN_VALUE;

//         for(int num : nums){
//             min = Math.min(min,num);
//             max = Math.max(max,num);
//         }
//         return gcd(min,max);
//     }
//     public int gcd(int a,int b){
//         while(b!=0){
//             int tem = b;
//             b = a % b;
//             a = tem;
//         }
//         return a;
//     }
// }


// class Solution {
//     public int findGCD(int[] nums) {
//         int min=Integer.MAX_VALUE;
//         int max=Integer.MIN_VALUE;

//         for(int num : nums){
//             min = Math.min(min,num);
//             max = Math.max(max,num);
//         }
//         return gcd(min,max);
//     }
//     public int gcd(int a,int b){
//         while(b>0 && a>0){
//             if(a>b) a=a%b;
//             else b=b%a;
//         }
//         if(a==0){
//             return b;
//         }
//         return a;
//     }
// }


class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        return gcd(min,max);
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}