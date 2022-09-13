package ru.viscount.app;



public class Square {
    int size;

    public Square(int size) {
        this.size = size;
    }

    public int squareArea(int size){
        return size * size;
    }
    public int perimeterOfSquare(int size){
        return size * 4;
    }
    public double diagonal(int size){
        return size * Math.sqrt(2);
    }
}
