
import java.util.Arrays;
/**
    This program takes two sorted arrays (length m & n) and merge them 
    to create another array of length (m+n).

    Time Complexity : O(m+n)
    Space Complexity : O(m+n)
 */
public class MergeTwoSortedArray {
    public static void main(String[] args) {
    int[] array1 = new int[]{4,15,19,89,149,789,8898};
    int[] array2 = new int[]{2,9,17,55};

    //merge two arrays
    int[] mergedArr = new int[array1.length+array2.length];
    int i=0,j=0,k=0;
    while(i < array1.length && j < array2.length) {
      if(array1[i] < array2[j]) {
        mergedArr[k] = array1[i];
        i++;
      } else if(array1[i] > array2[j]) {
        mergedArr[k] = array2[j];
        j++;
      }
      k++;
    }
    //copy rest from array1
    if(i < array1.length) {
      while(i < array1.length) {
          mergedArr[k] = array1[i];
          i++;
          k++;
      }
    }
    //copy rest from array2
    if(j < array2.length) {
      while(j < array2.length) {
        mergedArr[k] = array2[j];
        j++;
        k++;
      }
    }
    System.out.println(Arrays.toString(mergedArr));
  }
}