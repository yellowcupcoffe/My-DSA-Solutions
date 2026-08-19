class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] res = cleaned.toCharArray();

        int l =0;
        int r = res.length-1;

        while(l<r){
            if(res[l] != res[r] ){
                return false;
            } else {
                r--;l++;
            }
        }
    return true;
    }
}