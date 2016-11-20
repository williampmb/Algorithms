/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import algorithms.sorting.MergeSort;
import datastructures.BinarySearchTree;
import algorithms.sorting.QuickSort;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author William
 */
public class CSBaseKnowledge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        
        BinarySearchTree bt = new BinarySearchTree(10);
        int height = bt.height();
        bt.insert(5);
        bt.insert(15);
        bt.insert(18);
        bt.insert(7);
        bt.insert(2);
        
        BinarySearchTree found = bt.search(300);
        bt.remove(3);
        
        String inOrder = bt.inOrder();
        
        
        System.out.println(found.getData());

    }

    private static void testSortingAlgorithms() throws NumberFormatException, FileNotFoundException, IOException {
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

            QuickSort qs = new QuickSort();
            a1 = qs.execute(a1);
            //MergeSort ms = new MergeSort();
            //a1 = ms.execute(a1);

            for (int i : a1) {
                System.out.print(i + " ");
            }
            System.out.println("");
            input = br.readLine();
        }
    }

}
