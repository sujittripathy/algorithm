import java.util.*;

//1.6
public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        //String str = "aabccccaaa";
        while(true) {
            String input = sc.next();
            if(input == "abc") {
                break;
            }
            String res = countCharsStr(input);
            System.out.println("Response String : " + res);
        }
        sc.close();
    }

    private static String countCharsStr(String str) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++) {
            if(i != str.length()-1 && 
                str.charAt(i) == str.charAt(i+1)) {
                count += 1;        
            } else {
                sb.append(str.charAt(i));
                sb.append(count+1);
                count = 0;
            }
        }
        //If compressed string is less than orig str then return else 
        // return original string
        return sb.toString().length() < str.length() 
                ? sb.toString() : str;
    }
}