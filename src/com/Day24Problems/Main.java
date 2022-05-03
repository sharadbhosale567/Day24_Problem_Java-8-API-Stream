package com.Day24Problems;

public class Main {
    public static void main(String[] args) {

        PersonDetails person = new PersonDetails();
        person.firstName("Sharad");
        person.lastName("Bhosale");
        person.Address("At post ");
        person.City("nashik");
        person.State("Maharashtra");
        person.ZipCode(420000);
        person.PhoneNumber("7387232500");
        person.Email("sgb@gmail.com");
        System.out.println(person.toString());
    }
}
