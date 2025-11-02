class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        
        final int EMPTY = 0;
        final int GUARD = 1;
        final int WALL = 2;
        final int GUARDED = 3; 

        int[][] grid = new int[m][n];

        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = WALL;
        }

        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = GUARD;
        }

        for (int[] guard : guards) {
            int r = guard[0];
            int c = guard[1];

            for (int j = c + 1; j < n; j++) {
                if (grid[r][j] == WALL || grid[r][j] == GUARD) break; 
                grid[r][j] = GUARDED; 
            }
            for (int j = c - 1; j >= 0; j--) {
                if (grid[r][j] == WALL || grid[r][j] == GUARD) break;
                grid[r][j] = GUARDED;
            }
            for (int i = r + 1; i < m; i++) {
                if (grid[i][c] == WALL || grid[i][c] == GUARD) break;
                grid[i][c] = GUARDED;
            }

            for (int i = r - 1; i >= 0; i--) {
                if (grid[i][c] == WALL || grid[i][c] == GUARD) break;
                grid[i][c] = GUARDED;
            }
        }
        int unguardedCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == EMPTY) {
                    unguardedCount++;
                }
            }
        }

        return unguardedCount;
    }
}