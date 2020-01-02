/**
 * 
 * given the array 
 *  [1,1,1,1,2,3,4,5,6,6,7]
 *  a. modify the array in place
 *  b. return the size of the unique count
 */
import java.util.*;

public class DudupArrayInPlace {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,1,1,2,3,4,5,6,6,7};
        //1,2,3,4,5,6,-1,-1,-1,6,7
        //                     ^
        //          ^        
        int i = 1;
        int j = 0;
        int count = 1;
        while(i<arr.length) {
            if(arr[i] != arr[j]) {
                arr[j+1] = arr[i];
                j++;
                count++;
            }
            i++;
        }
        System.out.println("unique value count : " + count);
    }
}