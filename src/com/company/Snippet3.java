package com.company;

import java.util.function.Predicate;

public class Snippet3 {
    public static void main(String[] args) {
        System.out.println();
    }
    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }
}

/*
Question
Which of the following lines can fill in the blank 7 line to print true? (Choose all that apply.)
A. test(i -> i == 5) //true
B. test(i -> {i == 5;}) //compile error: {i==5;} Not a statement
C. test((i) -> i == 5) //true
D. test((int i) -> i == 5) //compile error: int i - Incompatible parameter types in lambda expression: expected Integer but found int
E. test((int i) -> {return i == 5;}) //compile error: int i - Incompatible parameter types in lambda expression: expected Integer but found int
F. test((i) -> {return i == 5;}) //true
 */
