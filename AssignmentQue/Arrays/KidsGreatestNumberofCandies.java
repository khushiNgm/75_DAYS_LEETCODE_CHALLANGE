import java.util.*;
public class KidsGreatestNumberofCandies{

    public List <Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
                  //findMaxCandie
        for(int candy: candies){
               maxCandies = Math.max(candy,maxCandies);
        } 
        List <Boolean> result = new ArrayList<>();
        for(int candy: candies){
            result.add(candy + extraCandies >= maxCandies );
        }
        return result;       
    }
    public static void main(String args[]){
     int candies[] ={2,3,4,0,4,8};
     int extraCandies = 4;
                       //calling NON static function 
      KidsGreatestNumberofCandies obj = new KidsGreatestNumberofCandies();
        List<Boolean> result = obj.kidsWithCandies(candies, extraCandies);

        // Print the result
        System.out.println(result);


    }
}