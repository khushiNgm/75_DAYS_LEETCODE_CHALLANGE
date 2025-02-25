// 2215. Find the Difference of Two Arrays
// Example 1:
// Input: nums1 = [1,2,3], nums2 = [2,4,6]
// Output: [[1,3],[4,6]]
// Explanation:
// For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].
// For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].

import java.util.*;
public class DiffOfTwoArray{
    
     public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
         HashSet<Integer> set1 = new HashSet<>();
         HashSet<Integer> set2 = new HashSet<>();
         //add value in set1 HashSet 
         for(int val: nums1){
            set1.add(val);
         }
        //add value in set2 HashSet
         for(int val: nums2){
                    set2.add(val);
         }
         HashSet<Integer> ans1 = new HashSet<>();
         for(int val: nums1){
            if(set2.contains(val)==false){
                ans1.add(val);
            }
         }
         HashSet<Integer> ans2 = new HashSet<>();
         for(int val: nums2){
            if(set1.contains(val)==false){
                ans2.add(val);
            }
         }
         return Arrays.asList(new ArrayList<>(ans1),new ArrayList<>(ans2));
    }
    public static void main(String args[]){
        int nums1[] ={2,3,5,1};
        int nums2[] = {3,0,1,5};
         System.out.print(findDifference(nums1,nums2));
    }
} 
