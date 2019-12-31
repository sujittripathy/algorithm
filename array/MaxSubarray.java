/**
 * Kadane algorithm
 * 
 * https://leetcode.com/problems/maximum-subarray/
**/
public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = Integer.MIN_VALUE;
        int prevSum = nums[0];
        for(int i=1;i<nums.length;i++) {
           prevSum = Math.max(nums[i], prevSum + nums[i]);
           if(prevSum > maxSum) {
               maxSum = prevSum;
           }
        }
        System.out.println("maxSum :: " + maxSum);
    }
}