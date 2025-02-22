// day 3 -> QUESTION 1
import java.util.*;

public class ReverseWordString  {
    public static String reverseWords(String s) {
        Stack<String> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') { // Fix: Use ' ' instead of ''
                sb.append(s.charAt(i));
            } else {
                         //push one word in stack 
                if (sb.length() > 0) {
                    stk.push(sb.toString());
                    sb.setLength(0); // Reset for the next word
                }
            }
        }

        // Push the last word if it exists
        if (sb.length() > 0) {
            stk.push(sb.toString());
        }

                    // Rebuild the reversed string
        StringBuilder result = new StringBuilder();
        while (!stk.isEmpty()) { // Fix: Use isEmpty() instead of isEmpt()
            result.append(stk.pop());
            if (!stk.isEmpty()) { // Fix: Append space instead of empty string
                result.append(" ");
            }
        }

        return result.toString();
    }
    
    public static void main(String args[]){
        String s = "khushi always wins";
        System.out.print(reverseWords(s));

    }
}