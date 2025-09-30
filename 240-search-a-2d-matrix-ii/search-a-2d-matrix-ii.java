// class Solution{
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[i].length;j++){
//                 if(matrix[i][j]==target){
//                     return true;
//                 }
//             }
//         }return false;
//     }
// }

class Solution{
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row=0;
        int col=n-1;
        while(row<m && col>=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col]<target){
                row++;
            }
            else{
                col--;
            }
        }return false;
    }
}

// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         for (int i = 0; i < matrix.length; i++) {
//             int low = 0, high = matrix[i].length - 1;
//             while (low <= high) {
//                 int mid = low + (high - low) / 2;
//                 if (matrix[i][mid] == target) {
//                     return true;
//                 } else if (matrix[i][mid] < target) {
//                     low = mid + 1;
//                 } else {
//                     high = mid - 1;
//                 }
//             }
//         }
//         return false;
//     }
// }
