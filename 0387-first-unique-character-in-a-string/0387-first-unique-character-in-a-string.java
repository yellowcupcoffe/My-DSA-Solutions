class Solution {
    public int firstUniqChar(String s) {
         int[] count = new int[26];
        
        // Pass 1: Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 'a' - 'a' becomes index 0, 'b' - 'a' becomes index 1, etc.
            count[ch - 'a']++; 
        }
        
        // Pass 2: Find the first character with a count of exactly 1
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (count[ch - 'a'] == 1) {
                return i; // Found it! Return the index immediately.
            }
        }
        
        // If no character has a frequency of 1, return -1
        return -1;
    }
}