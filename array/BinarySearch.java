import java.util.*;

/**
    Search an item from a sorted array. Return the index of the item
    if the item is present in the array else return -1.

    Time Complexity : O(logn)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,10,19,55,89,101,256,889};
        Scanner sc = new Scanner(System.in);
        System.out.println(Arrays.toString(arr));
        while(true) {
            System.out.println("Enter item to search");
            int item = sc.nextInt();
            if(item == -1) {
                break;
            }
            int index = binarySearchHelper(arr,0, arr.length-1,item);
            System.out.println("Index is : " + index);
        }
    }

    //Search in a recursive manner
    public static int binarySearchHelper(int[] arr, int start, int end, int n) {
      int mid = start + ((end - start) / 2);
      if(arr[mid] == n) {
        return mid;
      }
      if(start < end) {
          if(arr[mid] < n) { // go right half
            return binarySearchHelper(arr, mid+1, end, n);
          } else { // go left
            return binarySearchHelper(arr, start, mid-1, n);
          }
      }
      return -1;
  }
}