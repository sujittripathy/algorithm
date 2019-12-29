import java.util.*;

//1.9
public class StringRotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter Original String : ");
        String origStr = in.next();
        System.out.println("Enter Rotation String : ");
        String rotStr = in.next();

        if(isSubString(origStr, rotStr)) {
            System.out.println("is rotation is true");
        } else {
            System.out.println("is rotation is false");
        }
    }

    private static boolean isSubString(String s1, String s2) {
        return (s1+s1).contains(s2);
    }
}