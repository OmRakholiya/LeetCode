// class Solution {
//     public int largestRectangleArea(int[] heights) {
//         int area=0;
//         int maxArea=0;
//         for(int i=0;i<heights.length;i++){
//             int minHeight=heights[i];
//             for(int j=i;j<heights.length;j++){
//                 minHeight = Math.min(minHeight,heights[j]);
//                 area = minHeight * (j-i+1);
//                 maxArea = Math.max(maxArea,area);
//             }            
//         }
//         return maxArea;
//     }
// }



class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea=0;
        int n = heights.length;
        for(int i=0;i<=n;i++){
            int currHeight = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && currHeight<heights[stack.peek()]){
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i-stack.peek()-1;
                maxArea = Math.max(maxArea, h*w);
            } 
            stack.push(i);
        }
        return maxArea;
    }
}