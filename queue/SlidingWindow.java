import java.util.*;

/**
 * Given an array X, find the sum of sliding window of size 3 ex -
 * [2,3,5,1,6,9,4], k=3
 * 
 * [10,9,12,16,19,15]
 */
public class SlidingWindow {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,1,6,9,4,2};
        int k = 3;
        int[] sol = new int[arr.length - k + 1];
        Queue<Integer> queue = new LinkedList<>();
        int sum = 0;
        int idx = 0;
        //Go over the array and add to a Queue
        for(int i: arr) {
            if(queue.size() == k) {
                sol[idx] = sum;
                sum -= queue.peek();
                queue.poll();
                idx++;
            } 
            queue.add(i);
            sum += i;                   
        }
        sol[idx] = sum;
        System.out.println("Result : " + Arrays.toString(sol));
    }
}