class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();

        int l1 = word1.length();
        int l2 = word2.length();

        int l=0;int r=0;

        while(l < l1 && r < l2){
            result.append(word1.charAt(l));
            l++;
            result.append(word2.charAt(r));
            r++;
        }


        if(l<word1.length()){
            result.append(word1.substring(l));
        }

        if(r<word2.length()){
            result.append(word2.substring(r));
        }


        return result.toString();
    }
}