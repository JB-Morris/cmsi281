package edu.lmu.cmsi.mike.recursivesorting.parts;

public class Fibonacci {


    public Fibonacci(int input) {
        if(input >= 0){
            FibonacciCounter(input);
        }else{
            throw new IllegalArgumentException("Cannot input negative value");
        }
    }

    public int FibonacciCounter(int x) {
        if(x == 0) {
            return 0;
        }
        else if(x == 1) {
            return 1;
        }
        else {
            return FibonacciCounter(x - 1) + FibonacciCounter(x - 2);
        }
    }


}