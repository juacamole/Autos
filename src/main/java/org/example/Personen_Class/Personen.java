package org.example.Personen_Class;

public class Personen {
    public static void main(String[] args){

        Person person1 = new Person("Schmidt", "Daniel", (byte) 27, "male", "Hölstein", "He/Him");
        person1.introduce("Schmidt", "Daniel", (byte) 27, "Hölstein","male", "He/Him");
        Person person2 = new Person("Burkja", "Chiara", (byte) 19, "female", "zurich", "She/They");
        person2.introduce("Burkja","Chiara", (byte) 19,"female","zurich",  "She/They");
        Person person3 = new Person("Prabakarann", "Pranavan", (byte) 126, "Genderfluid", "Washington DC", "They/it");
        person3.introduce("Prabakaran", "Pranavan", (byte) 126, "Genderfluid", "Washington DC", "They/it");
    }
}