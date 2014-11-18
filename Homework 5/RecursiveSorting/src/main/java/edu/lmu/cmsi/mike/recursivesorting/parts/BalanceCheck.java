package edu.lmu.cmsi.mike.recursivesorting.parts;

import java.lang.Character;
import java.util.Stack;

public class BalanceCheck {

    public static Stack<Character> stk = new Stack<Character>();
    private String str;

    public BalanceCheck() {

    }

    public static boolean check(String inpt) {
        int length = inpt.length();
        if(length == 0){
            throw new IllegalArgumentException("String length must be greater than 0");
        }
        for(int i = 0; i < length; i++) {
//            System.out.println(i);
//            System.out.println(inpt.charAt(i));
            if(inpt.charAt(i) == '(' || inpt.charAt(i) == ')' || inpt.charAt(i) == '[' || inpt.charAt(i) == ']'){
                if(!stackCheck(inpt.charAt(i))){
                    return false;
                }
            }else throw new IllegalArgumentException("Input must be '(', ')', '[', or ']' ");
        }
        if(!stk.empty()){
            return false;
        }
        return true;
    }

    private void setInput(String inpt){
        str = inpt;
    }

    private static boolean stackCheck(char in){
        Character inEdit = (Character) in;
        if(inEdit == '(' || inEdit == '['){
            stk.push(inEdit);
            return true;
        }else if(inEdit == ')'){
            Object y = stk.peek();
            if(y.equals('(')){
                stk.pop();
                return true;
            }else if(y.equals(null)){
                return false;
            }
        }else if(inEdit == ']'){
            Object y = stk.peek();
            if(y.equals('[')){
                stk.pop();
                return true;
            }else if(y.equals(null)) {
                return false;
            }
        }
        return false;
    }





}