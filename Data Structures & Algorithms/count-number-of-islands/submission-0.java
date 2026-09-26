class Solution {
    int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int isLand = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    isLand++;
                }
            }
        }

        return isLand;
    }

    public void dfs(char[][] grid, int r, int c){
        if (r < 0 || c < 0 || r>= grid.length || c >= grid[0].length || grid[r][c] == '0')return;

        grid[r][c] = '0';
        for(int[] d: dir){
            dfs(grid, r + d[0], c + d[1]);
        }
    }
}
