package edu.lmu.cmsi.mike.recursivesorting.parts;

import java.util.Stack;

public class BalanceCheck {
    public Stack stk = new Stack();
    private String str;


    public BalanceCheck() {

    }

    public boolean check(String inpt) {
        int length = inpt.length();
        if(length == 0){
            throw new IllegalArgumentException("String length must be greater than 0");
        }
        for(int i = 0; i < length; i++) {
            System.out.println(i);
            System.out.println(inpt.charAt(i));
            if(inpt.charAt(i) == '(' || inpt.charAt(i) == ')' || inpt.charAt(i) == '[' || inpt.charAt(i) == ']'){
                if(stackCheck(inpt.charAt(i)) == false){
                    return false;
                }
            }else throw new IllegalArgumentException("Input must be '(', ')', '[', or ']' ");
        }
        return true;
    }

    private void setInput(String inpt){
        str = inpt;
    }

    private boolean stackCheck(char x){
//        System.out.println(x);
//        char a = '(';
        if(x == '(' || x == '['){
            stk.push(x);
        }else if(x == ')'){
            Object y = stk.peek();
            if(y.equals('(')){
                stk.pop();
                return true;
            }else if(y.equals(null)){
                return false;
            }
        }else if(x == ']'){
            Object y = stk.peek();
            if(y.equals('[')){
                stk.pop();
                return true;
            }else if(y.equals(null)) {
                return false;
            }
        }
//        System.out.println("got here");
        return false;
    }





}