class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            if (nums[left] % 2 == 0) {
                // Already even, properly placed on the left
                left++;
            } else if (nums[right] % 2 != 0) {
                // Already odd, properly placed on the right
                right--;
            } else {
                // nums[left] is odd AND nums[right] is even -> Swap them!
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        
        return nums;
    }
}
