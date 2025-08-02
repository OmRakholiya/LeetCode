class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
            int h=Math.min(height[l],height[r]);
            int w=r-l;
            int area=h*w;
            maxArea=Math.max(maxArea,area);
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }return maxArea;
    }
}

// class Solution {
//     public int maxArea(int[] height) {
//         int maxArea=0;
//         for(int i=0;i<height.length;i++){
//             for(int j=i+1;j<height.length;j++){
//                 int h=Math.min(height[i],height[j]);
//                 int w=j-i;
//                 int area=w*h;
//                 maxArea=Math.max(maxArea,area);       
//             }
//         }
//         return maxArea;
//     }
// }