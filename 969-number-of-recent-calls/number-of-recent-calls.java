class RecentCounter {
    private List<Integer> l;
    public RecentCounter() {
        l = new ArrayList<>();
        
    }
    public int ping(int t) {
        l.add(t);
        int count=0;

        for(int time : l){
            if(time >= t-3000){
                count++;
            }
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */