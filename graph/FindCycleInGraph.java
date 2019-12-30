import java.util.*;

/**
 * 
 * Find whether the directed graph has a cycle or not?
 * 2->3->6 forms a cycle here
 * 
 * 1 -> 2 -> 3 -> 4
 *     .\ 6 ./   
 *         
 * 
 */

public class FindCycleInGraph {
    static boolean cycle = false;

    public static void main(String[] args) {
        Node node = buildGraph();
        dfs(node);
        System.out.println("Is cycle ?" + cycle);
    }

    private static Node buildGraph() {
        Node _1 = new Node(1);
        Node _2 = new Node(2);
        Node _3 = new Node(3);
        Node _4 = new Node(4);
        Node _6 = new Node(6);
        
        _1.neighbors = Arrays.asList(_2);
        _2.neighbors = Arrays.asList(_3);
        _3.neighbors = Arrays.asList(_4,_6);
        _6.neighbors = Arrays.asList(_2);

        return _1;
    }

    public static void dfs(Node node) {
        if(node.status == "VISITING") {
            cycle = true;
            return;
            //return true;
        }
        node.status = "VISITING";
        for(Node n: node.neighbors) {
            if(n.status == "VISITED") {
                continue;
            }
            dfs(n);
            if(cycle) {
                return;
            }
            n.status = "VISITED";
        }
    }
}

class Node {
    public int data;
    public String status;
    public List<Node> neighbors;

    public Node(int data) {
        this.data = data;
        this.status = "NOT_VISITED";
        this.neighbors = new ArrayList<>();
    }
}
