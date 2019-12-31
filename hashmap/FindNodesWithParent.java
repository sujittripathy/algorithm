import java.util.*;

/**
 * Suppose we have some input data describing a graph of relationships between parents
 *  and children over multiple generations. The data is formatted as a list of 
 * (parent, child) pairs, where each individual is assigned a unique integer identifier.

For example, in this diagram, 3 is a child of 1 and 2, and 5 is a child of 4:
            
1   2   4
 \ /   / \
  3   5   8
   \ / \   \
    6   7   10

Write a function that takes this data as input and returns two collections: one containing 
all individuals with zero known parents, and one containing all individuals with exactly one 
known parent.

findNodesWithZeroAndOneParents(parentChildPairs) => [
  [1, 2, 4],    // Individuals with zero parents
  [5, 7, 8, 10] // Individuals with exactly one parent
]
---
[1,3]		
[2,3]
[3,6]
[5,6]
[5,7]
[4,5]
[4,8]
[8,10]

Child to parent relationship map / aka Graph adjacency List

{3 -> 1,2} {6 -> 3,5} {7 -> 5} {5 -> 4} {8 -> 4} {10 -> 8}

matrix representation, row - parent, col - child

    0 1 2 3 4 5 6 7 8 9 10
0
1         1
2         1
3                1
4             1      1
5                1 1
6
7
8                        1
9

*/
public class FindNodesWithParent {
    public static void main(String[] args) {
        //data preparation
        List<List<Integer>> inputList = new ArrayList<>();
        inputList.add(Arrays.asList(1,3));
        inputList.add(Arrays.asList(2,3));
        inputList.add(Arrays.asList(3,6));
        inputList.add(Arrays.asList(5,6));
        inputList.add(Arrays.asList(5,7));
        inputList.add(Arrays.asList(4,5));
        inputList.add(Arrays.asList(4,8));
        inputList.add(Arrays.asList(8,10));

        List<List<Integer>> res = findNodesWithZeroAndOneParent(inputList);
        System.out.println(res);
    }

    private static List<List<Integer>> 
        findNodesWithZeroAndOneParent(List<List<Integer>> inputList) {
        //iterate over the input data and create the child to parents map
        // one child can have >1 parent
        Map<Integer, List<Integer>> pMap = new HashMap<>();
        //this list will only contain all unique parents from input
        Set<Integer> pSet = new HashSet<>();
        for(List<Integer> iList: inputList) {
            //iList contains 2 items (parent, child)
            // go over the child and build a Map
            int parent = iList.get(0);
            int child = iList.get(1);
            pSet.add(parent);
            if(pMap.containsKey(child)) {
                List<Integer> parentList = pMap.get(child);
                parentList.add(parent);
                pMap.put(child, parentList);
            } else {
                List<Integer> parentList = new ArrayList<>();
                parentList.add(parent);
                pMap.put(child, parentList);
            }
        }

        List<List<Integer>> response = new ArrayList<>();

        List<Integer> zeroParentList = new ArrayList<>();
        //go over the parent set and find which items not exists in pMap
        for(Integer i: pSet) {
            if(!pMap.containsKey(i)) {
                zeroParentList.add(i);
            }
        }

        List<Integer> oneParentList = new ArrayList<>();
        for(Map.Entry<Integer, List<Integer>> entry: pMap.entrySet()) {
            Integer key = entry.getKey();
            //List<Integer> val = (List<Integer>) entry.getValue();
            if(pMap.get(key).size() == 1) {
                oneParentList.add(key);
            }            
        }

        response.add(zeroParentList);
        response.add(oneParentList);
        return response;
    }
}