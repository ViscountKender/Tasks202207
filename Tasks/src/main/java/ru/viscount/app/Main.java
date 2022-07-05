package ru.viscount.app;

public class Main {
    public static void main(String[] args) {
        Person  person = new Person("Viktor", "Gugo", 50);
//        System.out.println(person);
//        person.Personmetod();
//        person.doWork();
//        person.goWork();
        int result;
        Calculator calculator= new Calculator(1,8);
       result = calculator.add();
        System.out.println(result);
        result = calculator.div();
        System.out.println(result);
        result = calculator.mul();
        System.out.println(result);
        result = calculator.sub();
        System.out.println(result);



    }



}

