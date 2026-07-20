class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            product *= digit;   // Update the product
            sum += digit;       // Update the sum
            n /= 10;            // Remove the last digit
        }
        
        return product - sum;
    }
}
