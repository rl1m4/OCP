package com.company;

public class ScoreSwitch {
    public static void main(String[] args) {
        final int score1 = 8, score2 = 3; char myScore = 7;
        switch (myScore) { //switch statement has only default case
            default:
                score1:
                2: 6: System.out.print("great-"); //compile error
                4: System.out.print("good-"); break; //compile error
                score2:
                1: System.out.print("not good-"); //compile error
        }
    }
}

/*
QUESTION:
A. great-good-
B. good-
C. not good-
D. great-good-not-good-
E. The code does not compile because default is not a keyword in Java.
F. The code does not compile for a different reason.

ANSWER:
F - line 9, 10 and 13: ';' expected Unexpected token
 */
