package ru.viscount.app;

public class Person {
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String toString(){
        return getClass().getSimpleName() + " name: " + name + " surname: " + getSurname() + " age: " + getAge();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void  Personmetod(){
        System.out.println("name: " + name  + ", " + "surname: " + surname + ", " + "age: " + age);

    }
    public void goWork(){
        System.out.println("Person went to work");
    }
    public void doWork(){
        System.out.println("Person do work");
    }
}
