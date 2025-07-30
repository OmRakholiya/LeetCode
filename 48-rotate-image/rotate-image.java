class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int tem=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=tem;
            }
        }
         for(int i=0;i<n;i++)  reverse(matrix[i]);
    }
    public void reverse(int row[]){
        int l=0;
        int r=row.length-1;
        while(l<r){
            int tem=row[l];
            row[l]=row[r];
            row[r]=tem;
            l++;
            r--;
        }
    }
}