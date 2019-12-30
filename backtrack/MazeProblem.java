import java.util.*;

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
        //This 2D array will be used for memoization
        Status[][] memo = new Status[grid.length][grid[0].length];
        for(Status[] arr: memo) {
            Arrays.fill(arr, Status.UNVISITED);
        }
        boolean res = pathHelper(grid, 0, 0, memo);
        System.out.println("Does path exists? " + res);
    }

    private static boolean pathHelper(int[][] grid, int i, int j, Status[][] memo) {
        //base case
         //a. path found
        if(i == grid.length - 1 && j == grid[0].length-1) {
             return true;
        }
        //if bounced return false
        if(oob(grid, i, j) || grid[i][j] == 1) {
            return false;
        }
        //check for node is not visited only to avoid loop
        if(memo[i][j] == Status.NO_PATH || memo[i][j] == Status.VISITING) {
            return false;
        }
        memo[i][j] = Status.VISITING;
        //up        
        if(pathHelper(grid, i-1, j, memo)) {
            return true;
        }
        //down
        if(pathHelper(grid, i+1, j, memo)) {
            return true;
        }
        //left
        if(pathHelper(grid, i, j-1, memo)) {
            return true;
        }
        //right
        if(pathHelper(grid, i, j+1, memo)) {
            return true;
        }
        //not found
        memo[i][j] = Status.NO_PATH;
        return false;
    }

    /*
            UP -> (i-1, j)
            DOWN -> (i+1, j)
            LEFT -> (i, j-1)
            RIGHT -> (i, j+1)
     */
    private static boolean oob(int[][] grid, int i, int j) {
        return i < 0 || i >= grid.length || j < 0 || j >= grid[0].length;
    }
}

enum Status {
    UNVISITED,
    VISITING,
    NO_PATH;
}