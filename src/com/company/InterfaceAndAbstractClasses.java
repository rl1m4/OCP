package com.company;

import java.util.ArrayList;

interface CanSwin{}

class Amphibian implements CanSwin{}

abstract class Tadpole extends Amphibian {}

public class InterfaceAndAbstractClasses {
    public static void main(String[] args) {
        var tadpoles = new ArrayList<Tadpole>();
        for(Amphibian amphibian: tadpoles){
            Object tadpole = amphibian;
        }
    }
}
/*
Which of the following types can be inserted into the blank that allows the program to compile successfully? (Choose all that apply.)
A. CanSwim - YES
B. Boolean
C. Amphibian - YES
D. Tadpole
E. Object - YES
F. None of the above; the program contains a compilation error.

The for-each loop implicitly casts each Tadpole object to an Amphibian reference,
which is permitted because Tadpole is a subclass of Amphibian.
From there, any supertype of Amphibian is permitted without an explicit cast.
This includes CanSwim, which Amphibian implements, and Object,
which all classes extend from, making options A and E correct.
Option C is also correct since the reference is being cast to the same type.
Option B is incorrect, since Boolean is not a supertype of Amphibian.
Option D is also incorrect. Even though the underlying object is a Tadpole instance, it requires an explicit cast on line 9 since the reference type is Amphibian
 */