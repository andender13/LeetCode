package arrays.easy;

public class IslandPerimeter {

    public static void main(String[] args) {
        IslandPerimeter islandPerimeter = new IslandPerimeter();
        System.out.println(islandPerimeter.islandPerimeter(new int[][]{
                {0, 1, 0, 1},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 0, 1}}));
    }

    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || j >= grid[0].length || i >= grid.length || grid[i][j] == 0) {
            return 1;
        }
        if (grid[i][j] == -1) {
            return 0;
        }
        grid[i][j] = -1;
        int perimeter = 0;
        perimeter += dfs(grid, i + 1, j);
        perimeter += dfs(grid, i - 1, j);
        perimeter += dfs(grid, i, j + 1);
        perimeter += dfs(grid, i, j - 1);
        return perimeter;
    }
}
