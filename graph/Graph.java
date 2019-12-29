import java.util.*;

public class Graph {

    public static void main(String[] str) {
        // construct the graph here
        Map<String, String[]> network = new HashMap<String, String[]>() {{
            put("Min",new String[]{"William", "Jayden", "Omar"});
            put("William", new String[]{"Min", "Noam"});
            put("Jayden", new String[]{"Min", "Amelia", "Ren", "Noam"});
            put("Ren", new String[]{"Jayden", "Omar"});
            put("Amelia", new String[]{"Jayden", "Adam", "Miguel"});
            put("Adam", new String[]{"Amelia", "Miguel", "Sofia", "Lucas"});
            put("Miguel", new String[]{"Amelia", "Adam", "Liam", "Latham"});
            put("Noam", new String[]{"Nathan", "Jayden", "William"});
            put("Omar", new String[]{"Ren", "Min", "Scott"});
        }};

        Map<String, String[]> sNetwork = new HashMap<String, String[]>() {{
            put("A", new String[]{"B", "C"});
            put("B", new String[]{"A", "C", "D"});
            put("C", new String[]{"A", "B"});
            put("D", new String[]{"B", "C"});
        }};

        // find the shortest path
        new Graph().findShortestPath(sNetwork, "A", "D");
    }

    public List<String> findShortestPath(Map<String, String[]> network,
                                        String startNode, String endNode) {

      // Add the startnode to queue
      Queue<String> queue = new ArrayDeque<String>();
      queue.add(startNode);

      HashSet<String> visitedNodes = new HashSet<>();
     // visitedNodes.add(startNode);

      // Fetch the neibours & add to queue
      while(!queue.isEmpty()) { 
          String node = queue.remove(); //C
          visitedNodes.add(node);//A,B,C
          for(String s: network.get(node)) { //A,B,D
             if(s.equals(endNode)) {
                 System.out.println("end node" + endNode);
                 break;
             }
             if(!visitedNodes.contains(s)) {
                queue.add(s); // [B,D]
             }
           }
      }
      return null;    
    }
}



/**
    Start Node - A
    End Node - D
*/

