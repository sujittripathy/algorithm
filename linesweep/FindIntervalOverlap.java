import java.util.*;
/**
 * 
 * Given a list of time intervals, 
 * find if any of them overlap.
 * For example,Intervals -> ​[5,7], [1,3], [6,9]​ ->
 *  Intervals ​[5,7]​ and ​[6,9]​ overlap, so we return true.
 * 
 */

public class FindIntervalOverlap {
    public static void main(String[] str) {
        //By using Collections
        // List<int[]> iList = new ArrayList<>();
        // iList.add(new int[]{5,7});
        // iList.add(new int[]{1,3});
        // iList.add(new int[]{6,9});

        // for(int[] arr: iList) {
        //     System.out.print(Arrays.toString(arr) + ",");
        // } 

        //by using 2D Array
        int[][] intArr = {{5,7},{1,3},{7,9}}; 
        for(int[] arr: intArr) {
            System.out.print(Arrays.toString(arr) + ",");
        } 

        //Sort ascending by start time
        // Collections.sort(iList, new Comparator<int[]>() {
        //     @Override
        //     public int compare(int[] arr1, int[] arr2) {
        //         if(arr1[0] < arr2[0]) {
        //             return -1;
        //         } else if(arr1[0] > arr2[0]) {
        //             return 1;
        //         } else {
        //             return 0;
        //         }
        //     }
        // });
        Arrays.sort(intArr, new Comparator<int[]>() {
            @Override
            public int compare(int[] arr1, int[] arr2) {
                if(arr1[0] < arr2[0]) {
                    return -1;
                } else if(arr1[0] > arr2[0]) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
       // System.out.println("\n" + intArr.length + ", " + intArr[0].length);
        boolean isOverlap = false;
        for(int i=0;i<intArr.length;i++) {
            if(i == intArr.length-1) {
                break;
            }
            int[] arr = intArr[i];
            int s0 = arr[0];
            int e0 = arr[1];

            int[] next = intArr[i+1];
            int s1 = next[0];
            int e1 = next[1];
            //compate the end time of current to next event
            System.out.println(e0 + "," + s1);
            if(e0 >= s1 ) {
                isOverlap = true;
                break;
            }
        }
        System.out.println("is overlap? " + isOverlap);
    }
}