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
import datastructures.*;
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
        MyHeap h = new MyHeap(2);

        h.insert(10);
        h.insert(15);
        h.insert(12);
        h.insert(8);
        h.insert(26);
        h.insert(32);
        h.insert(10);
        h.insert(11);
        h.insert(132);
        h.insert(17);
        h.insert(16);
        h.insert(22);
        h.insert(13);
        h.insert(1);
        h.insert(44);
        h.insert(4);
        h.insert(48);
        h.insert(70);

        int min = h.min();
        System.out.println(min);
        min = h.min();
        System.out.println(min);
        
        h.insert(144);
        h.insert(145);

    }

}
