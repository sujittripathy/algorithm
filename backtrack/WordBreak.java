import java.util.*;
/**
 * str = "ilikemangotango";
 * 
 * Algorithm : 2 pointer (wouldn't work)
 *  2 pointer, when encounter a valid word in dict bring 2nd pointer to level of 1st
 * pointer, and reset the word
 *      ilikemangotango
 * p1 -               ^
 * p2 -               ^
 * 
 * Algorithm : Recursion/backtracking (worked)
 * jumpedoversomething => [jumped, over, some, thing]
 * 
 */
public class WordBreak {
    public static void main(String[] args) {
        //Add valid words to dict
        Set<String> dict = new HashSet<>();
        dict.add("i");
        dict.add("like");
      //  dict.add("man");
        dict.add("mango");
       // dict.add("tan");
       // dict.add("go");
        dict.add("tango");
        dict.add("jump");
        dict.add("jumped");
        dict.add("jumpedov");
        dict.add("over");
        dict.add("some");
        dict.add("thing");
        dict.add("something");

        String str = "jumpedoversomething";
        // StringBuilder sbResponse = new StringBuilder();
        // int p1 = 0;
        // int p2 = 0;
        // StringBuilder sb = new StringBuilder();
        // //iteratr over the chars
        // while(p1 < str.length()) {
        //     sb.append(str.charAt(p1));
        //     //if word present in dictionary
        //     if(dict.contains(sb.toString())) {
        //         sbResponse.append(sb.toString());
        //         sbResponse.append(" ");//add a space
        //         sb = new StringBuilder();//reset the obj
        //         p2 = p1;
        //     } 
        //     p1++;
        // }
        // System.out.println("Final string : " + (sbResponse.toString().length() == 0 ?
        //                 "null" : sbResponse.toString()));
        List<String> resStr = new ArrayList<>();
        wordBreakUtil(str, resStr, 0, dict);
        System.out.println(resStr);
    }

    //backtracking solution with recursion, without memoization
    private static boolean wordBreakUtil(String word, List<String> response, int pos, 
                                            Set<String> dict) {
        if(pos == word.length()) {
            return true;
        }
        for(int i=pos;i<word.length();i++) {
            String w = word.substring(pos, i+1);
            if(dict.contains(w)) {
                System.out.println(word.substring(pos, i+1) + " , " 
                    + word.substring(i+1, word.length()));
                response.add(w);
                if(wordBreakUtil(word, response, i+1, dict)){
                    return true;
                } else {
                    response.remove(response.size()-1);
                }
            } 
        }
        return false;
    }
}