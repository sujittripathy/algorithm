import java.util.*;

/**
 * You are given 2 words A and B, both of the same length. 
 * Your task is to transform one word to another changing only one letter each time. 
 * Each intermediate word should be a valid word in the dictionary.
 *  Print out the length of the path. 
 * (Alternate version: print out the intermediate words)

    A = CAB, B = DOG
    Result: 4 (CAB -> COB -> COG -> DOG)
 * 
 */
public class WordLadder {
    private static char[] chars =
         new char[]{'A','B','C','D','E','F','G','H','I','J','K','L',
                    'M','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    public static void main(String[] args) {
        int count = bfs("CAB", "DOG");
        System.out.println("Steps : " + count);
    }

    private static int bfs(String word1, String word2) {
        StringBuilder sb = new StringBuilder(word1);
        int count = 0;
        //iterate over the each char of the word1
        for(int i=0;i<word1.length();i++) {
            //replace each char with dict and see if that's a valid word
            for(char c: chars) {
                sb.insert(i, c);
                String s = sb.toString();
                if(dictionary().contains(s) && !s.equals(word1)) {
                    sb = new StringBuilder(s);
                    count++;
                    break;
                }
            }
            if(i == word1.length()-1 && !sb.toString().equals(word2)) {
                word1 = sb.toString();
            }
        }
        return count;
    }

    private static Set<String> dictionary() {
        Set<String> set = new HashSet<>();
        set.add("CAB");
        set.add("COB");
        set.add("COG");
        set.add("DOG");
        return set;
    }
}