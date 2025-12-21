class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> l = new ArrayList<>();
        for(int x : arr2){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]==x){
                    l.add(arr1[i]);
                    arr1[i]=-1;
                }
            }
        }
        Arrays.sort(arr1);
        for(int x:arr1){
            if(x!=-1){
                l.add(x);
            }
        }

        int[] result = new int[l.size()];
        for(int i=0;i<l.size();i++){
            result[i]=l.get(i);
        }
        return result;
    }
}