package org.example.Personen_Class;

public class Person {
    String name;
    String surname;
    byte age;

    String gender;
    String home;
    String pronouns;

    Person(String name, String surname, byte age, String gender, String home, String pronouns) {
    }
    public void introduce(String name, String surname, byte age, String gender, String home, String pronouns){

        System.out.println("Hello, i am " + surname + " " + name + ". I just moved to " + home + ", am " + age + " years old, and identify as " + gender + ". I use " + pronouns + " pronouns.");

    }
}
