/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import algorithms.sorting.MergeSort;
import datastructures.BinarySearchTree;
import algorithms.sorting.QuickSort;
import datastructures.BinaryNode;
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
        int[] toInsert = {100, 58, 47, 288, 31, 5, 10, 58, 64, 24, 6, 7, 9, 20, 30, 64, 90};
        int[] toInsert2 = {20, 27, 15, 9, 17, 24, 30, 5, 10, 16, 19, 23, 25, 32, 7, 23};
        int[] toInsert3 = {10,8,9,7,6,5,4,3,2,1};
        testTree(toInsert);

    }

    public static void testTree(int[] toInsert) {
        BinarySearchTree tree = new BinarySearchTree(toInsert[0]);
        for (int i = 1; i < toInsert.length; i++) {
            boolean insert = tree.insert(toInsert[i]);
            System.out.println("inserting: " + toInsert[i] + " success:" + insert);
        }
        
        System.out.println(tree.inOrder() + " altura: " + tree.height());
        tree.delete(20);
        tree.delete(32);
        tree.delete(5);
        tree.delete(7);
        tree.delete(17);
        tree.delete(116);
        tree.delete(16);
        tree.delete(25);
        tree.delete(23);
        tree.delete(9);
        tree.delete(10);
        tree.delete(27);
        tree.delete(24);
        tree.delete(30);
        tree.delete(30);
        tree.delete(19);
        tree.delete(15);
        System.out.println("");
          System.out.println(tree.inOrder()  + " altura: " + tree.height());
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
