package edu.lmu.cmsi.mike.recursivesorting;

import edu.lmu.cmsi.mike.recursivesorting.parts.Fibonacci;
import edu.lmu.cmsi.mike.recursivesorting.parts.Multiply;
import edu.lmu.cmsi.mike.recursivesorting.parts.StringToInt;
import edu.lmu.cmsi.mike.recursivesorting.parts.BalanceCheck;

public class App {



    public static void main(String[] args) {
        int fibInput = 10;
        int fibOutput;

        int multInput1 = 5;
        int multInput2 = 6;
        int multOutput;

        boolean balanceOutput;

        String strInput = "123456";

        String parenInput1 = "()()()()[][][][]";
        String parenInput2 = "(]";
        String parenInput3 = "((())";


        Fibonacci fib = new Fibonacci();
        fibOutput = fib.FibonacciCounter(fibInput);
        System.out.println(fibOutput);

        Multiply mult = new Multiply();
        multOutput = mult.multiply(multInput1, multInput2);
        System.out.println(multOutput);

        StringToInt STI = new StringToInt();
        System.out.println(STI.converter(strInput, strInput.length() - 1, 1));

        BalanceCheck balCheck = new BalanceCheck();

        balanceOutput = balCheck.check(parenInput1);
        System.out.println("Parenthetic balance: " + balanceOutput);

        balanceOutput = balCheck.check(parenInput2);
        System.out.println("Parenthetic balance: " + balanceOutput);

        balanceOutput = balCheck.check(parenInput3);
        System.out.println("Parenthetic balance: " + balanceOutput);

    }
}