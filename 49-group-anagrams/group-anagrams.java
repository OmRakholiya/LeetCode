// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         if(strs==null  || strs.length==0){
//             return new ArrayList<>();
//         }
//         HashMap<String,List<String>> map = new HashMap<>();

//         for(String str : strs){
//             String fString = getfString(str);

//             if(map.containsKey(fString)){
//                 map.get(fString).add(str);
//             }
//             else{
//                 List<String> l = new ArrayList<>();
//                 l.add(str);
//                 map.put(fString,l);
//             }
//         }
//         return new ArrayList<>(map.values());
//     }

//     private String getfString(String str){
//         int[] freq =new int[26];
//         for(char c : str.toCharArray()){
//             freq[c - 'a']++;
//         }
//         StringBuilder sb = new StringBuilder("");
//         char c = 'a';
//         for(int i : freq){
//             sb.append(c);
//             sb.append(i);
//             c++;
//         }
//         return sb.toString();
//     }
// }




// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         HashMap<String,List> map = new HashMap<>();

//         for(String str : strs){
//             int[] count =new int[26];

//             for(char c : str.toCharArray()){
//                 freq[c - 'a']++;
//             }
//             StringBuilder sb = new StringBuilder();
//             for(int i: count){
//                 sb.append('#');
//                 sb.append(i);
//             }
//             String key = sb.toString();
//             if(map.containsKey(key)){
//                 map.put(key, new ArrayList<String>());
//             }
//             map.get(key).add(str);
//         }
//         return new ArrayList<>(map.values());
//     }
// }







class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            
            String key = new String(arr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}




