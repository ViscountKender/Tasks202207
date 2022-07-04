package ru.viscount.app;

public class Main {
    public static void main(String[] args) {
        Person  person = new Person("Viktor", "Gugo", 50);
        System.out.println(person);
        person.Personmetod();
        person.doWork();
        person.goWork();

    }

}

