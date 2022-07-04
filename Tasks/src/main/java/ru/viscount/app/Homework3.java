package ru.viscount.app;

public class Homework3 {
    public static void main(String[] args) {
        String result;
        Human human = new Human("Ivan", 30, "m");
        human.giveСharacteristics();
        Square square = new Square("big", 40,160);
        square.characteristics();
        Square square1 = new Square("cmall", 3, 9);
        square1.characteristics();
        Phone phone = new Phone("Jake","London","+799999");
        phone.phone();
        phone.phoneData();
        phone.StringgetMyNumber();
        result = phone.StringgetMyNumber();
        System.out.println(result);

    }
}
