/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

/**
 *
 * @author William
 */
public class PeakFiding {
    
    public static void main(String[] args){
        int[] a = {10,5,4,6,7,100,1,20,33,47,96,4,15,17,44,43,26};
        int p = aPeakFindingBS(a);
        System.out.println("peak: " + p);
    
    }
    
    //Time complexity O(n)
    public static int aPeakFindingLinear(int[] array){
        int peak = Integer.MIN_VALUE;
        if(array[0]>=array[1]) peak= array[0];
        if(array[array.length-1]>=array[array.length-2]) peak = array[array.length-1];
        for(int i=1;i<array.length-1;i++){
            if(array[i]>=array[i-1]&&array[i]>=array[i+1]){
               peak = array[i];
               break;
            }
        }
        return peak;
    }
    
    //Time complexity O(log n)
    public static int aPeakFindingBS(int[] array){
        if(array.length==1) return array[0];
        int peak = aPeakFindingBS(array,0,array.length);
        return peak;
    }

    private static int aPeakFindingBS(int[] array, int start, int end) {
        int mid = (start+end)/2;
        int peak;
        if(array[mid] < array[mid-1]) peak = aPeakFindingBS(array, start, mid-1);
        else if(array[mid] <array[mid+1]) peak = aPeakFindingBS(array, mid+1, end);
        else peak = array[mid];
        return peak;
    }
    
}
