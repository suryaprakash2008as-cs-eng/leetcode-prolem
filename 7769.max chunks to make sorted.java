class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0;
        int maxSoFar = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // Update the maximum value seen in the current chunk
            maxSoFar = Math.max(maxSoFar, arr[i]);
            
            // If the max value matches the current index, we can form a chunk
            if (maxSoFar == i) {
                chunks++;
            }
        }
        
        return chunks;
    }
}
