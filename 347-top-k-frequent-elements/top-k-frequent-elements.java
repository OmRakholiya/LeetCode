// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int num: nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//         }
//         PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

//         for(int num : map.keySet()){
//             minheap.add(num);
//             if(minheap.size()>k){
//                 minheap.poll();
//             }
//         }
//         int res[] = new int[k];
//         for(int i=0;i<k;i++){
//             res[i]=minheap.poll();
//         }
//         return res;
//     }
// }




class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> maxheap = new PriorityQueue<>((a,b)->map.get(b)-map.get(a));

        for(int num : map.keySet()){
            maxheap.add(num);
        }
        int res[] = new int[k];
        for(int i=0;i<k;i++){
            res[i]=maxheap.poll();
        }
        return res;
    }
}

