class Solution {
    public int firstUniqChar(String s) {
        int[] charCounts = new int[26];
        
        // Pass 1: Tally up the counts of every character
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
        }
        
        // Pass 2: Find the first character with a frequency of exactly 1
        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i; // Return the index immediately
            }
        }
        
        // If no unique character exists
        return -1;
    }
}