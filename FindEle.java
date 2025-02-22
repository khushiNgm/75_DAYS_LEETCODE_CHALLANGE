 /*
 Question 2:

         There is an integer array nums sorted in 
 ascending order (with distinct values).Prior to being
  passed to your function, nums is possibly rotated at 
  an unknown pivot  index k (1  <=  k  <  nums.length)  
  such  that  the  resulting  array  is [nums[k], nums[k+1],
     ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed). 
     
Example 1:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 0 Output:   4
 Example 2:Input:nums = [4,  5, 6, 7, 0, 1, 2], target = 3 Output:   -1 
 */
                                       //Find index WIth linear approch APPROCH 1
           /*                            
import java.util.*;
public class FindEle{
    public static int FindElemValue(int arr[],int target){
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {4,1,2,5,1,6};
        int target = 8;
        System.out.print(FindElemValue(arr,target));
    }
}
*/
                          //FIND INDEX WITH BINAY SEARCH APPROCH 02
                        //   BOUNDATIONS 
                        //   -> work on sorted array
                           
     import java.util.*;
    public class FindEle{
    public static int FindElemValue(int arr[],int target){
        
        int n = arr.length;
        int firstEle = 0;
        int lastEle = n-1;
      
       while(firstEle<=lastEle){
         int mid = firstEle + (lastEle - firstEle) /2 ;

         if(arr[mid]==target){
            return mid;
         }
         else if(arr[mid]>target){
             lastEle = mid-1;
         }
         else{
            firstEle = mid+1;
         }
       }
        return -1;
        }
       
    
    public static void main(String args[]){
        int arr[] = {2,3,4,5,6,7};
        int target = 8;
        System.out.print(FindElemValue(arr,target));
    }
}   