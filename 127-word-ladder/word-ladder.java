class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) return 0;
        
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        
        queue.add(beginWord);
        visited.add(beginWord);
        
        int level = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                
                if (word.equals(endWord))
                    return level;
                
                for (String next : wordList) {
                    if (!visited.contains(next) && isOneLetterDiff(word, next)) {
                        queue.add(next);
                        visited.add(next);
                    }
                }
            }
            level++;
        }
        
        return 0;
    }
    
    private boolean isOneLetterDiff(String a, String b) {
        int diff = 0;
        
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                diff++;
        }
        
        return diff == 1;
    }
}