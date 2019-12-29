import java.util.*;

//1.2
/**
 * ABC 
 * ACB
 * BAC
 * BCA
 * CAB
 * CBA
 */
public class CheckPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s1");
        String s1 = sc.next();
        System.out.println("Enter s2");
        String s2 = sc.next();
        boolean res = isPermutation(s1, s2);
        System.out.println("Is permutation : " + res);
        sc.close();
    }

    //Sort the chars in the string. will return true if both the strings
    // are permutation
    private static boolean isPermutation(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char[] s1arr = s1.toCharArray();
        char[] s2arr = s2.toCharArray();
        Arrays.sort(s1arr);
        Arrays.sort(s2arr);
        return Arrays.equals(s1arr, s2arr);
    }
}