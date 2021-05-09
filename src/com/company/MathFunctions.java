package com.company;

public class MathFunctions {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }
    public static void main(String[] args) {
	    var a = 15;
	    var b = 10;
        MathFunctions.addToInt(a, b);
        System.out.println(a);
    }
}

/*
Q: 10, 15, compile error line5, compile errpr line 8, none?
A: 15
 */

