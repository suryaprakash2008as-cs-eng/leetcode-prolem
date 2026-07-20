class Solution {
    public int maximum69Number (int num) {
        // Convert the number to a string to easily manipulate individual digits
        String numStr = String.valueOf(num);
        
        // Find the index of the first '6' from the left
        int firstSixIndex = numStr.indexOf('6');
        
        // If a '6' is found, replace it with '9'
        if (firstSixIndex != -1) {
            char[] chars = numStr.toCharArray();
            chars[firstSixIndex] = '9';
            return Integer.parseInt(new String(chars));
        }
        
        // If there are no '6's, the number is already at its maximum
        return num;
    }
}
