/*           1:Given an integer array nums, return true if any 
value appears at least twice in the array, and return
 false if every element is 
 
 distinct.Example 
 1:Input:nums = [1, 2, 3, 1]
 Output:   true Example 
 2:Input:nums = [1, 2, 3, 4]
 Output:   false Example 
 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
 Output:   true 

*/ 
                                                             //brute force approch TYPE 01
                            /*
import java.util.*;
public class FindTwiceAppear{
    public static boolean FindDistinctArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[])
    {
       int arr[] ={1,3,3,4,6};
        System.out.print(FindDistinctArray(arr));
    }
}                             */

                                                          //with the help of sort fuction we can solve it 
  
  /*
import java.util.*;
public class FindTwiceAppear{
    public static boolean FindDistinctArray(int arr[]){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=1;i<n;i++){
          if(arr[i]==arr[i-1])
          {
            return true;
          }
        }
        return false;
    }
    public static void main(String args[])
    {
       int arr[] ={1,3,4,6};
        System.out.print(FindDistinctArray(arr));
    }
}  */
                                                      //with the help of SET DATA STRUCTURE


import java.util.*;
public class FindTwiceAppear{
    public static boolean FindDistinctArray(int arr[]){
          int n = arr.length;
          Set <Integer> st = new HashSet<Integer>();
          for(int i =0;i<n;i++){
            if(st.contains(arr[i]))
            return true;
            else 
            st.add(arr[i]);
          }

        return false;
    }
    public static void main(String args[])
    {
       int arr[] ={1,3,4,6};
        System.out.print(FindDistinctArray(arr));
    }
}   
