package ru.viscount.app;



public class Square {
    int size;

    public Square(int size) {
        this.size = size;
    }

    public int squareArea(){
        return size * size;
    }
    public int perimeterOfSquare(){
        return size * 4;
    }
    public double diagonal(){
        return size * Math.sqrt(2);
    }
}
