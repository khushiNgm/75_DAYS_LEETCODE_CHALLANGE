
//DAY 02 -> QUESTION 02
import java.util.*;
public class ReverseVowelsOfString{
      public static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int left = 0, right = str.length - 1;

        while (left < right) {
            while (left < right && !isVowel(str[left])) left++;
            while (left < right && !isVowel(str[right])) right--;

            // Swap vowels
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }

        return new String(str);
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    
    public static void main(String args[]){
        String s="khushi";
       System.out.print(reverseVowels(s));
    }
}
