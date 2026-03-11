class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        String flip = "";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i) == '0'){
                flip += '1'; 
            }
            else{
                flip += '0';
            }
        }
        return Integer.parseInt(flip ,2); 
    }
}