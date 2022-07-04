package ru.viscount.app;

public class Phone {
    String name;
    String surname;
    String number;

    public Phone(String name, String surname, String number) {
        this.name = name;
        this.surname = surname;
        this.number = number;
    }
    public void phoneData(){
        System.out.println("name: " + name + ", " + "surname: " + surname + ", " + "number: " + number);
    }
   public void phone(){
       System.out.println("name: " + name + ", " + "number: " + number);
   }
    public String StringgetMyNumber(){
        return number;

    }
}
