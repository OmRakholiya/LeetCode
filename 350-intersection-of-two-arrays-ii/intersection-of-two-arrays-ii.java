class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result=new ArrayList<>();
        boolean[] visited=new boolean[nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !visited[j]){
                    result.add(nums1[i]);
                    visited[j]=true;
                    break;
                }
            }
        }
        int[] resultArr=new int[result.size()];
        for(int i=0;i<result.size();i++){
            resultArr[i]=result.get(i);
        }
        return resultArr;
    }
}