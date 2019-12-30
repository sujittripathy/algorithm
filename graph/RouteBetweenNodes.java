import java.util.*;

/**
 * 
 * 4.1
 * 
 * Given a directed graph, design an algorithm to find out whether 
 * there is a route between the nodes.
 * 
 * 1 -> 2 <- 4
 *      |  >  /\
 *      V /    \
 *      3       5 -> 6
 *  
 * path -> 1 -> 2 -> 3 -> 4
 * 
 * Algorithm : DFS
 */


public class RouteBetweenNodes {
    public static void main(String[] str) {
        //build the graph
        Node _1 = new Node(1);
        Node _2 = new Node(2);
        Node _3 = new Node(3);
        Node _4 = new Node(4);
        Node _5 = new Node(5);
        Node _6 = new Node(6);

        _1.neighbors = Arrays.asList(_2);
        _2.neighbors = Arrays.asList(_3);
        _3.neighbors = Arrays.asList(_4);
        _4.neighbors = Arrays.asList(_2);
        _5.neighbors = Arrays.asList(_4);
        _5.neighbors = Arrays.asList(_6);

        dfs(_5, _6);
        System.out.println("Is there a path ? " + exists);
    }

    private static boolean exists = false;

    //search nodes with dfs
    private static void dfs(Node src, Node dest) {
        //go over all the nodes
        for(Node nei : src.neighbors) {
            if(nei.status == "NOT_VISITED") {
                nei.status = "VISITING";
                if(nei.data == dest.data) {
                    exists = true;
                    return;
                }
                dfs(nei, dest);
                nei.status = "VISITED";
            }
        }
    }
}

class Graph {
    public List<Node> nodesList;
}

class Node {
    public int data;
    public String status;
    public List<Node> neighbors;

    public Node(int data) {
        this.data = data;
        this.neighbors = new ArrayList<>();
        this.status = "NOT_VISITED";
    }
}