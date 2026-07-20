class Solution {
    public void moveZeroes(int[] nums) {
        int writePointer = 0;
        
        // Iterate through the array with a read pointer
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            // If the current element is non-zero
            if (nums[readPointer] != 0) {
                // Swap the elements at writePointer and readPointer
                int temp = nums[writePointer];
                nums[writePointer] = nums[readPointer];
                nums[readPointer] = temp;
                
                // Move the write pointer forward
                writePointer++;
            }
        }
    }
}
