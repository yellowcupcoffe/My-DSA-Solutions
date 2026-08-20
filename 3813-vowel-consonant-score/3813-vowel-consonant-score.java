class Solution {
    public int vowelConsonantScore(String s) {
        int v=0;
        int c=0;

        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ){
                v++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                c++;
            }

            
        }

        if(c> 0){
        int res = (v/c);
            return res; }

            return 0;
    }
}