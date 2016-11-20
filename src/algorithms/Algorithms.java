/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import algorithms.sorting.MergeSort;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author William
 */
public class Algorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new FileReader("src/algorithms/input.txt"));
        String input;

        input = br.readLine();
        while (input != null && !input.equals("")) {
            String[] split = input.split(" ");
            int[] a1 = new int[split.length];
            int count = 0;
            for (String str : split) {
                a1[count] = Integer.valueOf(str);
                count++;
            }

           // int[] result = MergeSort.merge(a1, a2);
           a1 = new algorithms.sorting.QuickSort().execute(a1);

            for (int i : a1) {
                System.out.print(i + " ");
            }
            System.out.println("");
             input = br.readLine();
        }

    }

}
