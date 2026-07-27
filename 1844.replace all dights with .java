class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        
        for (int i = 1; i < arr.length; i += 2) {
            // Shift character at i - 1 by the digit value at index i
            arr[i] = (char) (arr[i - 1] + (arr[i] - '0'));
        }
        
        return new String(arr);
    }
}
