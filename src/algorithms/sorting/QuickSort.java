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
public class QuickSort implements SortAlgorithm {

    int[] a;

    @Override
    public int[] execute(int[] array) {
        a = array;
        int wall = 0;
        int pivot = array[array.length - 1];

        quickSort(wall, pivot, array.length - 1);

        return a;
    }

    private void quickSort(int wall, int pivot, int posPivot) {
        int start = wall;
        int end = posPivot;
        int current = wall;
        int tmp;
        
        if (current == posPivot) {
            //break when the subarray has lenght one.
            return;
        }

        while (posPivot != current) {
            if (a[current] < pivot) {
                //Put everything smaller than pivot at the right side.
                tmp = a[wall];
                a[wall] = a[current];
                a[current] = tmp;
                wall++;
                current = wall;
            } else if (pivot == a[current]) {
                if (posPivot != current) {
                    //If it has repeated numbers, this solves the case.
                    current++;
                } else {
                    //If it gets the last two elements of the array.
                    tmp = a[wall];
                    a[wall] = pivot;
                    a[current] = tmp;
                    if (current != wall) {
                        //if it is not at the end of the array
                        wall++;
                    }
                }
            } else {
                //do nothing, move forward.
                current++;
            }
        }
            
        if (pivot == a[current]) {
            tmp = a[wall];
            a[wall] = pivot;
            a[current] = tmp;
            if (current != wall) {
                wall++;
            }
        }

        //Split the right side of the pivot, from the left side
        quickSort(start, a[wall - 1], wall - 1);
        quickSort(wall, a[end], end);

    }

}
