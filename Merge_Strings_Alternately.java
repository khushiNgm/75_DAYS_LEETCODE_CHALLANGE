//Day 01 ->QUESTIN 01 

import java.util.*;
public class Merge_Strings_Alternately{

     public static String mergeAlternately(String word1, String word2) {

     StringBuilder sb = new StringBuilder("");
     for(int i=0;i<word1.length() || i<word2.length(); i++){

        if(i<word1.length()){
             sb.append(word1.charAt(i));
        }

        if(i<word2.length()){
            sb.append(word2.charAt(i));
        }

     }   
      return sb.toString();
        
    }
    public static void main(String args[]){
        String word1 ="KHUSHI";
        String word2 ="HAPPY";
        System.out.print( mergeAlternately(word1,word2));

    }
}