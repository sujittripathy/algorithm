/**
    program takes a binary String and convert to an integer.
    Ex - 1010 => 10
         1111 => 15
 */
public class BinaryToDec {
     public static void main(String[] args) {
        String s = "1111";
        int dec = 0;
        int j = 0;
        for(int i=s.length()-1;i>=0;i--) {
            dec += (s.charAt(i) & 1) * (int)Math.pow(2,j++);
        }
        System.out.println(dec);
  }
}