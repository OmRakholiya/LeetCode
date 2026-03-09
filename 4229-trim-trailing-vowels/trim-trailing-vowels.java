class Solution {
    public String trimTrailingVowels(String s) {
        int end = s.length()-1;
        while(end >= 0){
            char last = s.charAt(end);
            if(last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u'){
                end--;
            }
            else{
                break;
            }
        }
        return s.substring(0,end+1);
    }
}