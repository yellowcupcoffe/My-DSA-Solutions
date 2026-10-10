class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder clean = new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                clean.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        int start =0;
        int end = clean.length()-1;


    while(start < end){
        if(clean.charAt(start) != clean.charAt(end) ){
            return false;
        } else {
            start++;
            end--;
        }
    }

    return true;
    }
}