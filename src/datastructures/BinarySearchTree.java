/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author William
 */
public class BinarySearchTree {

    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BinarySearchTree getLeft() {
        return left;
    }

    public void setLeft(BinarySearchTree left) {
        this.left = left;
    }

    public BinarySearchTree getRight() {
        return right;
    }

    public void setRight(BinarySearchTree right) {
        this.right = right;
    }
    private BinarySearchTree left;
    private BinarySearchTree right;

    public BinarySearchTree(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int height() {
        int height = 0, heightLeft = 0, heightRight = 0;
        if (left != null) {
        }
        if (right != null) {
            heightRight = right.height();
        }
        int max = heightLeft > heightRight ? heightLeft : heightRight;
        height = max + 1;
        return height;
    }

    public String inOrder() {
        StringBuilder tree = new StringBuilder();
        if (left != null) {
            tree.append(left.inOrder());
        }
        tree.append(data + "-");

        if (right != null) {
            tree.append(right.inOrder());
        }
        return tree.toString();
    }

    public boolean insert(int value) {
        if (data < value) {
            if (right == null) {
                right = new BinarySearchTree(value);
            } else {
                right.insert(value);
            }
            return true;
        } else if (data > value) {
            if (left == null) {
                left = new BinarySearchTree(value);
            } else {
                left.insert(value);
            }
            return true;
        }

        return false;
    }

    public BinarySearchTree search(int value) {
        if(data == value){
            return this;
        }
        if(data > value){
            return left.search(value);
        }
        if(data < value){
            return right.search(value);
        }
        return null;
    }

    public void remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
