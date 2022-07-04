package ru.viscount.app;

public class Square {
    String name;
    int side;
    int area;

    public Square(String name, int side, int area) {
        this.name = name;
        this.side = side;
        this.area = area;
    }
    public void characteristics(){
        System.out.println("name: " + this.name + ", " + "side: " + this.side + ", " + "area: " + this.area);
    }

}
