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
        MyQueue q = new MyQueue(3);

        int pop = q.pop();
        System.out.println(pop);
        q.print();

        System.out.println("");
        q.push(1);
        q.push(2);
        q.push(3);
        q.print();
        int pop1 = q.pop();
        System.out.println(pop1);
        q.print();
        int pop2 = q.pop();
        System.out.println(pop2);
        q.print();
        int pop3 = q.pop();
        System.out.println(pop3);
        q.print();
        
    }

}
