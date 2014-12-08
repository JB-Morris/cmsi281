package edu.lmu.cmsi.tree;

import edu.lmu.cmsi.tree.node.BinaryTreeNode;
import edu.lmu.cmsi.tree.exception.DuplicateItemException;
import edu.lmu.cmsi.tree.exception.ItemNotFoundException;

import java.lang.Integer;
import java.util.ArrayList;
import java.util.Queue;

public class IntegerBinarySearchTree {

    protected BinaryTreeNode root;

    private ArrayList<Integer> preOrderList = new ArrayList<Integer>();
    private ArrayList<Integer> inOrderList = new ArrayList<Integer>();
    private ArrayList<Integer> postOrderList = new ArrayList<Integer>();
    private ArrayList<Integer> breadthFirstOrderList = new ArrayList<Integer>();
    private Queue<BinaryTreeNode> queue;

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
//    throw new UnsupportedOperationException("Insert needs to be implemented");
        if (contains(x)){
            throw new DuplicateItemException("x already exists");
        }
        inserter(x, root);
    }

    /**
     * Find the smallest item in the tree.
     *
     * @return smallest item or throws an exception if the tree is empty.
     * @throws edu.lmu.cmsi.tree.exception.ItemNotFoundException
     */
    public int findSmallestValue() {
//        throw new UnsupportedOperationException("findSmallestValue needs to be implemented");
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
//        throw new UnsupportedOperationException("findLargestValue needs to be implemented");
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
//        throw new UnsupportedOperationException("contains needs to be implemented");
        BinaryTreeNode node = finder(value, root);
        if (node == null) {
            return false;
        }else{
            return true;
        }

    }

    /**
     * Returns an preorder-traversed array
     *
     * @return an array of Integers, or empty if the tree is empty.
     */
    public Integer[] toPreOrder() {
//        throw new UnsupportedOperationException("toPreOrder needs to be implemented");
        preOrderList.clear();
        preOrder(root);
        int size = preOrderList.size();
        Integer[] integers = preOrderList.toArray(new Integer[size]);
        return integers;

    }

    /**
     * Returns an inorder-traversed array
     *
     * @return an array of Integers, or empty if the tree is empty.
     */
    public Integer[] toInOrder() {
//        throw new UnsupportedOperationException("toInOrder needs to be implemented");
        inOrderList.clear();
        inOrder(root);
        int size = inOrderList.size();
        Integer[] integers = inOrderList.toArray(new Integer[size]);
        return integers;
    }

    /**
     * Returns an postorder-traversed array
     *
     * @return an array of Integers, or empty if the tree is empty.
     */
    public Integer[] toPostOrder() {
//        throw new UnsupportedOperationException("toPostOrder needs to be implemented");
        postOrderList.clear();
        postOrder(root);
        int size = postOrderList.size();
        Integer[] integers = postOrderList.toArray(new Integer[size]);
        return integers;
    }

    /**
     * Returns an Breadth First-traversed array
     *
     * @return an array of Integers, or empty if the tree is empty.
     */
    public Integer[] toBreadthFirstOrder() {
//        throw new UnsupportedOperationException("toBreadthFirstOrder needs to be implemented");
        breadthFirstOrderList.clear();
        breadthFirstOrder(root);
        int size = breadthFirstOrderList.size();
        Integer[] integers = postOrderList.toArray(new Integer[size]);
        return integers;
    }

    private BinaryTreeNode inserter(int x, BinaryTreeNode node) {
        if (node == null) {
            node = new BinaryTreeNode(x);
        } else if (node.getLeft().getValue() < x) {
            node.setLeft(inserter(x, node.getLeft()));
        } else if (node.getRight().getValue() > x) {
            node.setRight(inserter(x, node.getRight()));
        } else {
//            throw new DuplicateItemException(x + "is a duplicate input");
        }
        return node;
    }

    private BinaryTreeNode finder(int value, BinaryTreeNode node) {
        while(node != null) {
            if(node.getLeft().getValue() < value) {
                node = node.getLeft();
            }else if (node.getRight().getValue() > value) {
                node = node.getRight();
            }else {
                return node;
            }

        }
        return null;
    }
    private BinaryTreeNode preOrder(BinaryTreeNode node) {
        if (node != null) {
            preOrderList.add(node.getValue());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }return node;

    }
    private BinaryTreeNode inOrder (BinaryTreeNode node) {
        if (node != null) {
            inOrderList.add(node.getValue());
            inOrder(node.getLeft());
            inOrder(node.getRight());
        }return node;
    }
    private BinaryTreeNode postOrder (BinaryTreeNode node) {
        if (node != null) {
            postOrderList.add(node.getValue());
            postOrder(node.getLeft());
            postOrder(node.getRight());
        }return node;
    }
    private BinaryTreeNode breadthFirstOrder(BinaryTreeNode node) {
        if (node != null) {
            queue.offer(node);
            while(!queue.isEmpty()) {
                node = queue.poll();
                breadthFirstOrderList.add(node.getValue());
            }
            if (node.getLeft() != null) {
                queue.offer(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.offer(node.getRight());
            }
        }
        return node;
    }
}