import java.util.*;

/**
 * coins are = [1,2,5] target = 5
 * 
 * [1,1,1,1,1] [1,1,1,2] [1,2,2] [5]
 */

public class CoinChangeProblem {
    public static void main(String[] args) {
        int[] coins = new int[]{1,2,5};
        List<Integer> bufferList = new ArrayList<>();
        coinChangeHelper(coins, bufferList, 0, 5);
    }

    private static void coinChangeHelper(int[] coins, List<Integer> bufferList,
                                             int soFar, int target) {
          //check if bufferList coin count is equals to target
          if(sumCoins(bufferList) == target) {
              //print coin array
              System.out.println(bufferList);
              return;
          }

          //Iterate over each coins 
          for(int i=0;i<coins.length;) {
                soFar += coins[i];
                if(soFar <= target) {
                    coinChangeHelper(coins, bufferList, soFar, target);
                } else {
                    soFar -= coins[i];
                    i++;
                }
          }
    }

    private static int sumCoins(List<Integer> list) {
        int sum = 0;
        for(int i : list) {
            sum += i;
        }
        return sum;
    }
}