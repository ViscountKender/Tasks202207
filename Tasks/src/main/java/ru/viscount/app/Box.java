package ru.viscount.app;

public class Box {
    int width;
    int height;
    int depth;

    public Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }
    Box box = new Box(2,4,6);
    int volume;


    public int volumeBoxes() {
        return  width * height * depth;

    }
}


