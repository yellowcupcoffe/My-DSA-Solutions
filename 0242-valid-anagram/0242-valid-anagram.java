class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

    char[] sQ = s.toCharArray();
    char[] tQ = t.toCharArray();

    Arrays.sort(sQ);
    Arrays.sort(tQ);

    for(int i=0;i<s.length();i++){
        if(sQ[i] == tQ[i] ){
            continue;
        } else {
            return false;
        }
    }

        return true;
    }
}