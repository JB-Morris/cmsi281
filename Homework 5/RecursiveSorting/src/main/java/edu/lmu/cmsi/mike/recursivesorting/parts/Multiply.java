package edu.lmu.cmsi.mike.recursivesorting.parts;

import java.lang.IllegalArgumentException;

public class Multiply {

    public Multiply() {
    }

    public static int multiply(int x, int y) {
        if(x < 0 || y < 0){
            throw new IllegalArgumentException("Cannot input negative number.");
        }
        if(x == 0 || y == 0) {
            return 0;
        }
        else {
            return x + multiply(x, y - 1);
        }
    }
}