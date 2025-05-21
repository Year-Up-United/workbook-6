package com.pluralsight;

public class Person {

    // variables to define what's needed
    String firstName;
    String lastName;
    int age;

    // constructor to create the person
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // print person
    public String toString(){
        return firstName + " " + lastName + " , Age: " + age;
    }


}
