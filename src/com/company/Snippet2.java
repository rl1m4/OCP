package com.company;

public class Snippet2 {
    public static void main(String[] args) {
        var s1 = "Java";
        var s2 = "Java";
        var s3 = "Ja".concat("va");
        var s4 = s3.intern();
        var sb1 = new StringBuilder(); sb1.append("Ja").append("va");
        System.out.println(s1 == s2); //true
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s3); //false because toString has different value
        System.out.println(s1 == s4); //true
        System.out.println(sb1.toString() == s1); //false because s1 toString != sb1 toString
        System.out.println(sb1.toString().equals(s1)); //true because sb1.toString() = "Java" and s1 = "Java" -> equals validates this value, not the toString()
    }
}

/*
It prints TRUE 4 times

- s1/s2/s4 = "Java" and has value = {byte[4]@789} [74, 97, 118, 97] -> toString()
- s3       = "Java" and has value = {byte[4]@796} [74, 97, 118, 97] -> toString()
- sb1      = {StringBuilder@782} "Java" and has value = {byte[16]@797 [74, 97, 118, 97, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
equals validates the assignment (toString()) not the value inside the object
 */