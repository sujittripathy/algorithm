/**
    Print a 2 dimentional matrix
 */
public class Matrix {
    public static void main(String[] str) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(matrix.length);
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}