// class Solution {
//     public int[][] merge(int[][] intervals) {
//         int n = intervals.length;
//         Arrays.sort(intervals,(a,b) -> a[0]-b[0]);

//         List<int[]> res = new ArrayList<>();

//         for(int i=0;i<n;i++){
//             int start = intervals[i][0];
//             int end = intervals[i][1];

//             if(!res.isEmpty() && end<=res.get(res.size()-1)[1]){
//                 continue;
//             }
//             for(int j=i+1;j<n;j++){
//                 if(intervals[j][0]<=end){
//                     end=Math.max(end,intervals[j][1]);
//                 }
//                 else{
//                     break;
//                 }
//             }
//             res.add(new int[]{start,end});
//         } 
//         return res.toArray(new int[res.size()][]);
//     }
// }


// class Solution {
//     public int[][] merge(int[][] intervals) {
//         int n = intervals.length;
//         Arrays.sort(intervals,(a,b) -> a[0]-b[0]);

//         List<int[]> res = new ArrayList<>();

//         for(int i=0;i<n;i++){
//             if(res.isEmpty() || intervals[i][0] > res.get(res.size()-1)[1]){
//                 res.add(intervals[i]);
//             }
//             else{
//                 res.get(res.size()-1)[1]=Math.max(intervals[i][1],res.get(res.size()-1)[1]);
//             }
//         } 
//         return res.toArray(new int[res.size()][]);
//     }
// }



class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);

        Stack<int[]> stack = new Stack<>();

        for(int[] interval : intervals){
            if(stack.isEmpty() || interval[0] > stack.peek()[1]){
                stack.push(interval);
            }
            else{
                stack.peek()[1] = Math.max(interval[1],stack.peek()[1]);
            }
        } 
        return stack.toArray(new int[stack.size()][]);
    }
}