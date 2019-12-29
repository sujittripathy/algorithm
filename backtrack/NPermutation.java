import java.util.*;

/**
    Array : [1,2,3,4,5,6,7,8] 
    Print all permutations of length 3 of the given array. 

    o/p:
    [1,2,3]
    [1,2,4]
    [1,2,5]
    [1,2,6]
    ...
    [1,2,8]
    [1,3,4]
    [1,3,5]
    [1,3,6]
    ...

 */
public class NPermutation {
    public static void main(String[] args) {
       	int[] arr = new int[]{1,2,3,4,5,6,7};
        permutationHelper(arr, new int[3], 0, 0);
    }

    private static void permutationHelper(int[] arr,int[] buffer,
                                            int aIndex, int bIndex) {
         if(bIndex == buffer.length) {
             System.out.println(Arrays.toString(buffer));
             return;
         }
         
         for(int i=aIndex;i<arr.length;i++) {
             buffer[bIndex] = arr[i];
             permutationHelper(arr, buffer, i+1, bIndex+1);
         }
    }
}