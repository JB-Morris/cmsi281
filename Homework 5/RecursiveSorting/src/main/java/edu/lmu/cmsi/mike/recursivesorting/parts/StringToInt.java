package edu.lmu.cmsi.mike.recursivesorting.parts;

public class StringToInt {
    public static int x = 0;
    public static int integer;

    public StringToInt(){

    }

    public static int converter(String y, int index, int times) {
        integer = Integer.parseInt(Character.toString(y.charAt(index)));
        x += integer * times;
        if (index == 0) {
            return x;
        }
        return converter(y, --index, times * 10);
    }
}