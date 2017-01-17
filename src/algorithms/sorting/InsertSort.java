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
public class InsertSort implements SortAlgorithm {
    
    @Override
    public int[] execute(int[] array) {
        for(int i = 1; i< array.length;i++){
            for(int j=i; j!=0;j--){
                if(array[j]<array[j-1]){
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j]=tmp;
                }else{
                    break;
                }
            }
        }
        return array;
    }
    
}
