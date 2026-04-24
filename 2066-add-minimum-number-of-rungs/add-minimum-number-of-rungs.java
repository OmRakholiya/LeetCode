class Solution {
    public int addRungs(int[] rungs, int dist) {
        int prev = 0;
        int count = 0;
        for(int rung : rungs){
            int gap = rung - prev;
            if(gap > dist){
                count += (gap-1)/dist;
            }
            prev = rung;
        }
        return count;
    }
}