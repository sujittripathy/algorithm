/**
 * 
 *  Given a 2D matrix print in Spiral order
 * 
 *  [  X        X
 *X    1, 2, 3, 4
 *     14,15,16,5
 *     13,20,17,6
 *     12,19,18,7
 * X   11,10, 9,8
 *  ]
 * 
 *  print : 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
 * 
 *  i = 0, j = arr[i].length - 1;
 *  [i,j] [i,j+1] [i,j+2] [i, j+3]
 *                        [i+1, j+3]
 *                        [i+2, j+3]
 *                        [i+3, j+3]
 *                        [i+4, j+3]
 *  
 */

public class TwoDMatrixSpiral {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
            {1,2,3,4},
            {14,15,16,5},
            {13,20,17,6},
            {12,19,18,7},
            {11,10, 9,8}
        };

        int start = 0;
        for(int i=start;i<arr.length;i++) {
            for(j=i;j<arr[0].length;j++) {
                System.out.print(arr[i][j] + ",");
            }
            if()
            System.out.println("\n");
        }

    }
}