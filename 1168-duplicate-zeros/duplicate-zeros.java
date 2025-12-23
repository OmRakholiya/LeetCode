class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        int[] tem = new int[n];
        int i=0;
        int j=0;
        while(i<n && j<n){
            tem[j++]=arr[i];
            if(arr[i]==0 && j<n){
                tem[j++]=0;
            }
            i++;
        }
        for(int k=0;k<n;k++){
            arr[k]=tem[k];
        }
    }
}