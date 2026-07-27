class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[102];
        
        // Step 1: Count frequencies
        for (int num : nums) {
            count[num + 1]++;
        }
        
        // Step 2: Running sum to get counts of smaller numbers
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        
        // Step 3: Build result array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = count[nums[i]];
        }
        
        return result;
    }
}
