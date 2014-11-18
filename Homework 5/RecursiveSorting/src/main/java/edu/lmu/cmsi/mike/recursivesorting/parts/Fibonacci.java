package edu.lmu.cmsi.mike.recursivesorting.parts;

import java.lang.IllegalArgumentException;

public class Fibonacci {


    public Fibonacci() {
//        if(input >= 0){
//            FibonacciCounter(input);
//        }else{
//            throw new IllegalArgumentException("Cannot input negative value");
//        }
    }

    public static int FibonacciCounter(int x) {
        if(x < 1){
            throw new IllegalArgumentException("Cannot input negative value");
        }else if(x == 1) {
            return 0;
        }
        else if(x == 2) {
            return 1;
        }
        else {
            return FibonacciCounter(x - 1) + FibonacciCounter(x - 2);
        }
    }


}