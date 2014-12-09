package edu.lmu.cmsi.tree;

import edu.lmu.cmsi.tree.node.BinaryTreeNode;
import edu.lmu.cmsi.tree.exception.DuplicateItemException;
import edu.lmu.cmsi.tree.exception.ItemNotFoundException;

import java.lang.Integer;
import java.lang.System;
import java.util.ArrayList;
import java.util.Queue;

public class IntegerBinarySearchTree {

    protected BinaryTreeNode root;


    public IntegerBinarySearchTree() {
        this.root = null;
    }

    /**
     * Insert into the tree.
     *
     * @param x the item to insert.
     * @throws edu.lmu.cmsi.tree.exception.DuplicateItemException if x exists.
     */
    public void insert(int x) {
        root = inserter(x, root);
    }

    private BinaryTreeNode inserter(int x, BinaryTreeNode node) {
        if (node == null) { //if node == root
            return new BinaryTreeNode(x); //root =
        }else if (node.getValue() == x){
            throw new DuplicateItemException(x + "is a duplicate input");
        }else if (node.getValue() > x) {
            node.setLeft(inserter(x, node.getLeft()));
        } else {
            node.setRight(inserter(x, node.getRight()));
        }
        return node;
    }

    /**
     * Find the smallest item in the tree.
     *
     * @return smallest item or throws an exception if the tree is empty.
     * @throws edu.lmu.cmsi.tree.exception.ItemNotFoundException
     */
    public int findSmallestValue() {
        BinaryTreeNode node = root;
        if (node == null) {
            throw new ItemNotFoundException("there is no smallest value");
        }else if (node != null) {
            while(node.getLeft() != null) {
                node = node.getLeft();
            }
        }return node.getValue();
    }

    /**
     * Find the largest item in the tree.
     *
     * @return the largest item or throws an exception if the tree is empty.
     * @throws edu.lmu.cmsi.tree.exception.ItemNotFoundException
     */
    public int findLargestValue() {
        BinaryTreeNode node = root;
        if (node == null) {
            throw new ItemNotFoundException("there is no largest value");
        }else if (node != null) {
            while(node.getRight() != null) {
                node = node.getRight();
            }
        }return node.getValue();
    }

    /**
     * Returns whether or not the value exists in the tree
     *
     * @return true if the value exists, false otherwise
     */
    public boolean contains(int value) {
        return finder(value, root);
    }

    private boolean finder(int value, BinaryTreeNode node) {
        if (node == null) {
            return false;
        }else if (node.getValue() == value) {
            return true;
        }else if (node.getValue() > value) {
            return finder(value, node.getLeft());
        }else {
            return finder(value, node.getRight());
        }
    }

    /**
     * Returns an preorder-traversed array
     *
     * @return an array of Integers, or empty if the tree is empty.
     */
    public Integer[] toPreOrder() {
        ArrayList<Integer> OrderList = new ArrayList<Integer>();
//        OrderList.clear();
        preOrder(root, OrderList);
        int size = OrderList.size();
        Integer[] integers = OrderList.toArray(new Integer[size]);
        return integers;

    }
    private BinaryTreeNode preOrder(BinaryTreeNode node, ArrayList<Integer> OrderList) {
        if (node != null) {
            OrderList.add(node.getValue());
            preOrder(node.getLeft(), OrderList);
            preOrder(node.getRight(), OrderList);
        }return node;

    }

    /**
     * Returns an inorder-traversed array
     *
     * @return an array of Integers, or empty if the tree is empty.
     */
    public Integer[] toInOrder() {
        ArrayList<Integer> OrderList = new ArrayList<Integer>();
//        OrderList.clear();
        inOrder(root, OrderList);
        int size = OrderList.size();
        Integer[] integers = OrderList.toArray(new Integer[size]);
        return integers;
    }

    private BinaryTreeNode inOrder (BinaryTreeNode node, ArrayList<Integer> OrderList) {
        if (node != null) {
            inOrder(node.getLeft(), OrderList);
            OrderList.add(node.getValue());
            inOrder(node.getRight(), OrderList);
        }return node;
    }

    /**
     * Returns an postorder-traversed array
     *
     * @return an array of Integers, or empty if the tree is empty.
     */
    public Integer[] toPostOrder() {
        ArrayList<Integer> OrderList = new ArrayList<Integer>();
//        OrderList.clear();
        postOrder(root, OrderList);
        int size = OrderList.size();
        Integer[] integers = OrderList.toArray(new Integer[size]);
        return integers;
    }

    private BinaryTreeNode postOrder (BinaryTreeNode node, ArrayList<Integer> OrderList) {
        if (node != null) {
            postOrder(node.getLeft(), OrderList);
            postOrder(node.getRight(), OrderList);
            OrderList.add(node.getValue());
        }return node;
    }

    /**
     * Returns an Breadth First-traversed array
     *
     * @return an array of Integers, or empty if the tree is empty.
     */
    public Integer[] toBreadthFirstOrder() {
        ArrayList<Integer> OrderList = new ArrayList<Integer>();
        ArrayList<BinaryTreeNode> queue = new ArrayList<BinaryTreeNode>();
//        OrderList.clear();
        breadthFirstOrder(root, queue, OrderList);
        int size = OrderList.size();
        Integer[] integers = OrderList.toArray(new Integer[size]);
        return integers;
    }

    private BinaryTreeNode breadthFirstOrder(BinaryTreeNode node, ArrayList<BinaryTreeNode> queue, ArrayList<Integer> OrderList) {
        if (node != null) {
            queue.add(node);
            while(!queue.isEmpty()) {
                node = queue.remove(0);
                OrderList.add(node.getValue());
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }

        }
        return node;
    }
}