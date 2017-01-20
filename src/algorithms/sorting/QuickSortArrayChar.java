/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms.sorting;

/**
 *
 * @author William
 * 
 * Using a QuickSort to sort an Array of Chars
 */
public class QuickSortArrayChar {

        char[] array;

        public QuickSortArrayChar(char[] a) {
            array = a;
        }

        private int compare(QuickSortArrayChar c) {
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

        public static QuickSortArrayChar[] quickSort(QuickSortArrayChar[] array) {

            QuickSortArrayChar[] c = array;
            int wall = 0;
            int pivot = c.length - 1;

            quickSort(wall, pivot, c);
            return c;
        }

        protected static void quickSort(int wall, int posPivot, QuickSortArrayChar[] c) {
            int start = wall;
            int end = posPivot;
            QuickSortArrayChar tmp;
            QuickSortArrayChar current;

            if (wall == posPivot || wall > posPivot) {
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
}
