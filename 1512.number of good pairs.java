class Solution {
    public int numIdenticalPairs(int[] nums) {
        // Since constraints state 1 <= nums[i] <= 100
        int[] counts = new int[101];
        int goodPairs = 0;
        
        for (int num : nums) {
            // Add the number of times we've seen this element before
            goodPairs += counts[num];
            // Increment the count of this element
            counts[num]++;
        }
        
        return goodPairs;
    }
}
