package com.pluralsight;
// add scanner
import java.util.*;

public class Program {
    public static void main(String[] args) {

    // add array list
    ArrayList<Person> people = new ArrayList<>();
    people.add(new Person("Jayla","Jones","29"));
    people.add(new Person("Robyn", "Fenty", "36"));
    people.add(new Person("Christian", "Quezada","29"));
    people.add(new Person("Barbie", "Cox","81"));
    people.add(new Person("Kenneth", "Jones","32"));
    people.add(new Person("Greyson", "Hill","79"));
    people.add(new Person("Hannah", "Morgan","44"));
    people.add(new Person("James", "George","57"));
    people.add(new Person("Jack", "Mercedes","41"));
    people.add(new Person("Beyonce", "Carter","42"));

    // add scanner
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a name to search: ");
    String inputName = scanner.nextLine();

    // see if the array list matches & loop
    ArrayList<Person> matches = new ArrayList<>();
        for (Person p : people) {
            if (p.firstName.equalsIgnoreCase(inputName) || p.lastName.equalsIgnoreCase(inputName)) {
                matches.add(p);  // if it's a match, it's kept
            }
        }

    // this prints all matches
    for (Person p : matches) {
            System.out.println(p); // toString call-out
        }

    // counters
    int totalAge = 0;
    int oldest = Integer.MIN_VALUE;  // this is for the smallest possible number
    int youngest = Integer.MAX_VALUE;  // this is for the largest possible number

    // loop through the list
    for (Person p : people) {
            totalAge += p.age;

        if (p.age > oldest) {
                oldest = p.age;
            }

            if (p.age < youngest) {
                youngest = p.age;
            }
        }

        // print it all out
        double average = (double) totalAge / people.size();

        System.out.println("Average age: " + average);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);


    }
    }
