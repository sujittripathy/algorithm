import java.util.*;

/**
 * Count Inversions in an array
    Inversion Count for an array indicates – how far (or close) the array is from being sorted. If array is already sorted then inversion count is 0. If array is sorted in reverse order that inversion count is the maximum.
    Formally speaking, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j

    Example:
    The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
 * 
 *  Algorithm:
 *    > Iterate over the array with each element
 *    > if any number is less than current number on right then add to list
 *    > return the list
 *  Time C - O(n^2)
 */
public class InversionCount {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,1,3,5};
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] > arr[j]) {
                    List<Integer> intList = new ArrayList<>();
                    intList.add(arr[i]);
                    intList.add(arr[j]);
                    res.add(intList);
                }
            }            
        }
        System.out.println(res);
    }
}