class Solution {
    public boolean isPalindrome(String s) {
        
        String cleaned = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] charArray = cleaned.toCharArray();

        int l=0;
        int r = charArray.length-1;

        char temp = 'a';

        while(l<r){
            if(charArray[l] != charArray[r] ){
                return false;
            } else {
                l++;r--;
            }
        }

        return true;        
    }
}