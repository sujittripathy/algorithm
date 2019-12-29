/**
    Maze Problem: You are given a 2D array that represents a maze. 
    It can have 2 values - 0 and 1.1 represents a wall and 0 represents a path.
    The objective is to reach the bottom right corner, i.e, A[A.length-1][A.length-1]. 
    You start fromA[0][0]. You can move in 4 directions - up, down, left and right. 
    Find if a path exists to thebottom right of the maze
    
    [
        0,1,1,1
        0,1,1,1
        0,0,0,0
        1,1,1,0
    ]
 */
public class MazeProblem {
    public static void main(String[] args) {
        int[][] grid = new int[][]{{0,1,1,1},{0,1,1,1},{0,0,0,0},{1,1,1,0}};
        pathHelper(grid, 0, 0);
    }

    private static boolean pathHelper(int[][] grid, int i, int j) {
        //base case
         //a. path found
         if(i == grid.length - 1 && j == grid[0].length-1) {
             return true;
         }
        if(!isValid(grid, i, j)) {
            return false;
        }
        //up
        pathHelper(grid, i-1, j);
        //down
        pathHelper(grid, i+1, j);
        //left
        pathHelper(grid, i, j-1);
        //right
        pathHelper(grid, i, j+1);

        //not found
        return false;
    }

    /*
            UP -> (i-1, j)
            DOWN -> (i+1, j)
            LEFT -> (i, j-1)
            RIGHT -> (i, j+1)
     */
    private static boolean isValid(int[][] grid, int i, int j) {
        return i >=0 && j >= 0 && i < grid.length && j < grid[0].length 
                && grid[i][j] == 0;
    }
}