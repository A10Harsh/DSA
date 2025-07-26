
public class ratmaze {

    public static boolean solveMaze(int[][] maze) {
        int n = maze.length;
        int[][] solution = new int[n][n];

        if (backtrack(maze, 0, 0, solution)) {
            printSolution(solution);
            return true;
        } else {
            System.out.println("No path found.");
            return false;
        }
    }

    private static boolean backtrack(int[][] maze, int x, int y, int[][] solution) {
        int n = maze.length;

        // Check bounds and cell validity
        if (x >= n || y >= n || maze[x][y] == 0) return false;

        // Mark the cell as part of the path
        solution[x][y] = 1;

        // Destination reached
        if (x == n - 1 && y == n - 1) return true;

        // Move right
        if (backtrack(maze, x, y + 1, solution)) return true;

        // Move down
        if (backtrack(maze, x + 1, y, solution)) return true;

        // Backtrack: unmark the cell
        solution[x][y] = 0;
        return false;
    }

    private static void printSolution(int[][] solution) {
        for (int[] row : solution) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        solveMaze(maze);
    }
}
