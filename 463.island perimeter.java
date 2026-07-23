class Solution {
    public int islandPerimeter(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int perimeter = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    // Each land cell contributes 4 sides initially
                    perimeter += 4;

                    // If top neighbor is land, remove shared edge (counted twice)
                    if (r > 0 && grid[r - 1][c] == 1) {
                        perimeter -= 2;
                    }

                    // If left neighbor is land, remove shared edge (counted twice)
                    if (c > 0 && grid[r][c - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }

        return perimeter;
    }
}
