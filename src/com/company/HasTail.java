package com.company;
/*
interface HasTail { int getTailLength(); }
abstract class Puma implements HasTail {
    protected int getTailLength() { return 4; } //compile error here: attempting to assign weaker access privileges ('protected'); was 'public'
}
public class Cougar implements HasTail { //compile error here: Class 'Cougar' must either be declared abstract or implement abstract method 'getTailLength()' in 'HasTail'
    public static void main(String[] args) {
        var puma = new Puma(); //compile error here: 'Puma' is abstract; cannot be instantiated
        System.out.println(puma.getTailLength());
    }
    public int getTailLength(int length) { return 2; }
}
*/

/*
A. 2
B. 4
C. The code will not compile because of line 5.
D. The code will not compile because of line 7.
E. The code will not compile because of line 9.
F. The code will not compile because of line 10.
G. The output cannot be determined from the code provided.
 */