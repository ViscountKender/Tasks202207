package ru.viscount.app;

public class Human {
   private String name;
    private int age;
    private String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void giveСharacteristics(){
        System.out.println("name: "  +  name + ", " + "age: " + age + ", " + "gender: " + gender);
    }
}
