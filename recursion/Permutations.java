package recursion;

import java.util.*;

/**
    Given a collection of distinct integers, return all possible permutations.

    Input: [1,2,3]
    Output:
    [
        [1,2,3],
        [1,3,2],
        [2,1,3],
        [2,3,1],
        [3,1,2],
        [3,2,1]
    ]
 */
public class Permutations {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        List<Integer> buffer = new ArrayList<>();
        List<List<Integer>> pList = new ArrayList<>();
        permuteHelper(arr, buffer, pList, 0);

    }

    private static void permuteHelper(int[] arr, List<Integer> buffer, 
                                List<List<Integer>> pList, int aIndex) {
        if(buffer.size() == arr.length) {
            pList.add(buffer);
            return;
        }

        for(int i=aIndex;i<arr.length;i++) {
            buffer.add(arr[i]);
            permuteHelper(arr, buffer, pList, aIndex+1);
        }
    }
}

