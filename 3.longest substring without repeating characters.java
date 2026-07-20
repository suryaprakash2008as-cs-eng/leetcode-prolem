import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        
        // Map to store the character and its most recent index
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character is already in the map and within the current window
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                // Move the left pointer past the previous occurrence
                left = map.get(currentChar) + 1;
            }
            
            // Update or insert the character's newest position
            map.put(currentChar, right);
            
            // Calculate the window size and update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
