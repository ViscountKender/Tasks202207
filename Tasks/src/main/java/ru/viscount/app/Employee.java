package ru.viscount.app;

public class Employee {
    String name;
    String specialization;
    int workExperience;

    public Employee(){

    }

    public Employee(String n) {
        name = n;
    }

    public Employee(String n, String s) {
        name = n;
        specialization = s;
    }
    public Employee(int w){
        workExperience = w;
    }



}
