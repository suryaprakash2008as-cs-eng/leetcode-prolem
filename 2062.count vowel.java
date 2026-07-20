import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();
        
        // Loop through each possible starting character of the substring
        for (int i = 0; i < n; i++) {
            Set<Character> vowels = new HashSet<>();
            
            // Extend the substring from index i
            for (int j = i; j < n; j++) {
                char ch = word.charAt(j);
                
                // If it's a vowel, add it to our set
                if (isVowel(ch)) {
                    vowels.add(ch);
                    // If all 5 vowels are present, it's a valid substring
                    if (vowels.size() == 5) {
                        count++;
                    }
                } else {
                    // If we hit a consonant, no further substring starting at 'i' can be valid
                    break;
                }
            }
        }
        
        return count;
    }
    
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
