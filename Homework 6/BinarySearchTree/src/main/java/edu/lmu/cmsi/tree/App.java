package edu.lmu.cmsi.tree;

import edu.lmu.cmsi.tree.exception.DuplicateItemException;
import edu.lmu.cmsi.tree.exception.ItemNotFoundException;

public class App {


    public static void main(String[] args){

        IntegerBinarySearchTree tree = new IntegerBinarySearchTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(20);
        tree.insert(15);
        tree.insert(1);
        int smallest = tree.findSmallestValue();
        int largest = tree.findLargestValue();
        boolean contain = tree.contains(10);

        System.out.println(smallest);
        System.out.println(largest);
        System.out.println(contain);
    }


}