import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int totalElements = m * n;
        
        // Normalize k to avoid redundant full rotations
        k = k % totalElements;
        
        // Initialize the result grid with the correct dimensions
        int[][] temp = new int[m][n];
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                // Find the 1D position, add the shift, and wrap around
                int old1DIndex = r * n + c;
                int new1DIndex = (old1DIndex + k) % totalElements;
                
                // Convert the new 1D position back to 2D coordinates
                int newR = new1DIndex / n;
                int newC = new1DIndex % n;
                
                temp[newR][newC] = grid[r][c];
            }
        }
        
        // Convert the 2D array into the required List<List<Integer>> format
        List<List<Integer>> result = new ArrayList<>();
        for (int[] row : temp) {
            List<Integer> listRow = new ArrayList<>();
            for (int val : row) {
                listRow.add(val);
            }
            result.add(listRow);
        }
        
        return result;
    }
}
