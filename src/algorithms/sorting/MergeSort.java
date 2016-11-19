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
public class MergeSort {

    /*
    obs: InsertSort should be the fastest sort for all lists smaller than 5 elements
    obs2: MergeSort is usually faster for lists as small as 50 elements
    obs3: Cons: It takes memory to storage all sublists.
    Complexity:
     */
    public static int[] algorithm(int[] array) {
        int size = array.length;
        //At the size one, it is already sorted and it can't be divided again.
        if (size < 2) {
            return array;
        }
        //Divide the array in half - left and right - looking for odd and even lenghts
        int mid;
        int[] left, right;
        if (size % 2 == 0) {
            mid = size / 2;
            right = new int[mid];
        } else {
            mid = (size / 2) + 1;
            right = new int[mid - 1];
        }

        left = new int[mid];

        for (int i = 0; i < right.length; i++) {
            right[i] = array[mid + i];
        }
        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        //Send the new arrays to be divided
        left = algorithm(left);
        right = algorithm(right);

        return merge(left, right);

    }

    //Merge two SORTED arrays
    public static int[] merge(int[] array1, int[] array2) {
        int[] merged = new int[array1.length + array2.length];
        int posA2 = 0, posMerged = 0;

        //Compare the elements in Array 1 with Array 2 and place it
        for (int posA1 = 0; posA1 < array1.length; posA1++) {
            if (posA2 == array2.length) {
                merged[posMerged] = array1[posA1];
                posMerged++;
            } else if (array1[posA1] <= array2[posA2]) {
                merged[posMerged] = array1[posA1];
                posMerged++;
            } else {
                merged[posMerged] = array2[posA2];
                posA2++;
                posMerged++;
                posA1--;
            }
        }

        //if it stills elements on Array 2
        for (int j = posA2; j < array2.length; j++) {
            merged[posMerged] = array2[j];
            posMerged++;
        }

        return merged;
    }

}
