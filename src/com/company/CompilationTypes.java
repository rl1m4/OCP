package com.company;

public class CompilationTypes {
//    int monday = 3 + 2.0;
    double tuesday = 5_6L;
//    boolean wednesday = 1 > 2 ? !true;
    short thursday = (short) Integer.MAX_VALUE;
//    long friday = 8.0L;
//    var saturday = 2_.0;
}

/*
Which of the following expressions compile without error? (Choose all that apply.)
B, D.
Option A does not compile, as the expression 3 + 2.0 is evaluated as a double, and a double requires an explicit cast to be assigned to an int.
Option B compiles without issue, as a long value can be implicitly cast to a double.
Option C does not compile because the ternary operator (? :) is missing a colon (:), followed by a second expression.
Option D is correct. Even though the int value is larger than a short, it is implicitly cast to a short, which means the value will wrap around to fit in a short.
Option E is incorrect, as you cannot use a decimal (.) with the long (L) postfix. Finally, option F is incorrect, as an underscore cannot be used next to a decimal point. For more information, see Chapter 3
 */