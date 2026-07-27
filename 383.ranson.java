class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Optimization: If ransomNote is longer than magazine, it's impossible
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        
        int[] letterCounts = new int[26];
        
        // Count frequency of each character in magazine
        for (char c : magazine.toCharArray()) {
            letterCounts[c - 'a']++;
        }
        
        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (--letterCounts[c - 'a'] < 0) {
                return false;
            }
        }
        
        return true;
    }
}
