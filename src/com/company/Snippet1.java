package com.company;

public class Snippet1 {
    public static void main(String[] args) {
        int moon = 9, star = 2 + 2 * 3;
        float sun = star>10 ? 1 : 3;
        double jupiter = (sun + moon) - 1.0f;
        int mars = --moon <= 8 ? 2 : 3;
        System.out.printf(sun+"-"+jupiter+"-"+mars);
    }
}

/*
A. 1-11-2
B. 3.0-11.0-2
C. 1.0-11.0-3
D. 3.0-13.0-3
E. 3.0f-12-2
F. The code does not compile because one of assignments requires an explicit numeric cast.

ANSWER: 3.0-11.0-2
 */