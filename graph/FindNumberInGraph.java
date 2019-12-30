import java.util.*;

/**
 * 
 * 1 - 20 - 31
 * |  /   \  |
 * 9        11
 * 
 * Find whether a number is present in the graph or not. if present
 * return true else false.
 * 
 * Algorithm : BFS
 * 
 */

public class FindNumberInGraph {
    public static void main(String[] args) {
        Graph graph = buildGraph();
        int searchValue = 11;
        Queue<Node> queue = new LinkedList<>();
        boolean found = false;
        //iterate over the nodes list
        for(Node node : graph.nodesList) {
            if(node.status == "VISITED") {
                continue;
            }
            //take the node and run BFS
            node.status = "VISITING";
            queue.add(node);
            while(!queue.isEmpty()) {
                Node n = queue.peek();
                if(n.data == searchValue) {
                    found = true;
                    break;
                }
                for(Node nei : n.neighbors) {
                    //add only unvisited nodes to queue
                    if(nei.status == "NOT_VISITED") {
                        nei.status = "VISITING";
                        queue.add(nei);
                    }
                }
                n.status = "VISITED";
                queue.poll();
            }
            if(found) {
                break;
            }
        }
        System.out.println("Node found : " + found);
    }

    private static Graph buildGraph() {
        Node _1 = new Node(1);
        Node _20 = new Node(20);
        Node _31 = new Node(31);
        Node _9 = new Node(9);
        Node _11 = new Node(11);

        _1.neighbors = Arrays.asList(_20,_9);
        _9.neighbors = Arrays.asList(_1,_20);
        _20.neighbors = Arrays.asList(_1,_9,_31,_11);
        _31.neighbors = Arrays.asList(_20,_11);
        _11.neighbors = Arrays.asList(_20,_31);

        Graph graph = new Graph();
        graph.nodesList = Arrays.asList(_1,_20,_31,_9,_11);
        return graph;
    }
}

// enum Status {
//     NOT_VISITED,
//     VISITING,
//     VISITED;    
// }

class Graph {
    public List<Node> nodesList = new ArrayList<>();
}

class Node {
    public int data;
    public List<Node> neighbors;
    public String status;

    public Node(int data) {
        this.data = data;
        this.status = "NOT_VISITED"; //default state
    }
}

