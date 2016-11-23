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

    private BinaryNode root;

    public BinarySearchTree() {

    }

    public BinarySearchTree(int data) {
        root = new BinaryNode(data);
    }

    public int height() {
        return root.height();
    }

    public String inOrder() {
        if (root == null) {
            return "";
        }
        return root.inOrder();
    }

    public boolean insert(int value) {
        boolean success = false;
        if (root == null) {
            root = new BinaryNode(value);
            success = true;
        } else{
            root.insert(value);
        }
        return success;
    }

    public BinaryNode search(int value) {
        BinaryNode found = null;
        if (root != null) {
            found = root.search(value);
        }
        return found;
    }

    public boolean delete(int value) {
        boolean success = false;
        if (root != null) {
            if (root.getData() == value) {
                if (root.getRight() == null && root.getLeft() == null) {
                    root = null;
                } else if (root.getRight() == null) {
                    root = root.getLeft();
                } else if (root.getLeft() == null) {
                    root = root.getRight();
                } else {
                    BinaryNode so = smallAtRight(root.right);
                    copyNode(so, root);
                    root.right.delete(so.getData());
                }
                success = true;
            } else if (value > root.getData()) {
                if (root.getRight() != null) {
                    success = root.getRight().delete(value);
                }
            } else if (value < root.getData()) {
                if (root.getLeft() != null) {
                    success = root.getLeft().delete(value);
                }
            }
        }
        return success;
    }

    private BinaryNode smallAtRight(BinaryNode so) {
        BinaryNode smallOne = so;
        while (smallOne.left != null) {
            smallOne = smallOne.left;
        }
        return smallOne;
    }

    private void copyNode(BinaryNode from, BinaryNode to) {
        to.setData(from.getData());
    }
}
