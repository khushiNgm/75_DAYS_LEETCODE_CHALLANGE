//Day 02 

import java.util.*;
public class CanPlaceFlower{
     public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count= 0;
        for(int i =0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
            boolean emptyLeftPlot = i==0 || (flowerbed[i-1]==0 );
            boolean emptyRightPlot = (i== flowerbed.length-1) || (flowerbed[i+1]==0);
            
            if( emptyLeftPlot && emptyRightPlot ){
                flowerbed[i] =1;
                count ++;
                if(count >=n ){
                    return true;
                }
            }
            }
           
        }
        return count >= n;
        
    }
    public static void main(String args[]){
        int flowerbed[] ={1,0,0,0,1}, n =2;
        System.out.print( canPlaceFlowers(flowerbed,n));

    }
}