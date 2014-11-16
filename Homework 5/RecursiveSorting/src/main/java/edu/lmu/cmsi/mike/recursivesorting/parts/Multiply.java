package edu.lmu.cmsi.mike.recursivesorting.parts;

public class Multiply {

    public Multiply(int x, int y) {
        multiply(x, y);
    }

    public static int multiply(int x, int y) {
        if(x == 0 || y == 0) {
            return 0;
        }
        else {
            return x + multiply(x, y-1);
        }
    }
}