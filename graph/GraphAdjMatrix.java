/**
0   -    3
 \    /  |
   1     2
 */
public class GraphAdjMatrix {
    int vertex;
    int[][] matrix;

    public GraphAdjMatrix(int vertex) {
        this.vertex = vertex;
        this.matrix = new int[vertex][vertex];
    }

    //Add Edge
    public void addEdge(int src, int dest) {
        matrix[src][dest] = 1;
        matrix[dest][src] = 1;
    }

    //print graph
    public void print() {
        System.out.println("[");
        for(int row=0;row<matrix.length;row++) {
            System.out.print("[");
            for(int col=0;col<matrix[row].length;col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println("]");

        }
        System.out.println("]");
    }

    public static void main(String[] s) {
        GraphAdjMatrix graph = new GraphAdjMatrix(4);
        graph.addEdge(0,3);
        graph.addEdge(0,1);
        graph.addEdge(1,3);
        graph.addEdge(3,2);

        graph.print();
    }
}