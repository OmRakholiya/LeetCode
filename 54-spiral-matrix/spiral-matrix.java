class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length;
        int top =0;
        int bottom = matrix.length-1;
        int l=0;
        int r=matrix[0].length-1;
        while(top <= bottom && l <= r ){
            for(int j=l;j<=r;j++){
                list.add(matrix[top][j]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][r]);
            }
            r--;
            if(top<=bottom){
                for(int j=r;j>=l;j--){
                    list.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(l<=r){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][l]);
                }
                l++;;
            }
        }
        return list;
    }
}