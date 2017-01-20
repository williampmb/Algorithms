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

    public ArrayChar[] execute(ArrayChar[] array) {

        ArrayChar[] c = array;
        int wall = 0;
        int pivot = c.length - 1;

        quickSort(wall, pivot, c);
        return c;
    }

    private void quickSort(int wall, int posPivot, ArrayChar[] c) {
        int start = wall;
        int end = posPivot;
        ArrayChar tmp, current;

        if (wall == posPivot) {
            return;
        }

        for (int i = wall; i < posPivot; i++) {
            current = c[i];
            if (current.compare(c[posPivot]) == 1) {
                tmp = c[wall];
                c[wall] = current;
                c[i] = tmp;
                wall++;
            }
        }

        tmp = c[wall];
        c[wall] = c[posPivot];
        c[posPivot] = tmp;

        quickSort(start, wall - 1, c);
        quickSort(wall + 1, end, c);

    }

    class ArrayChar {

        char[] array;

        public ArrayChar(int size) {
            array = new char[size];
        }

        private int compare(ArrayChar c) {
            if (array.length != c.array.length) {
                return -1;
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i] > c.array[i]) {
                    return 1;
                } else if (array[i] < c.array[i]) {
                    return -1;
                }

            }
            return 0;
        }

    }

}
