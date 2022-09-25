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



    public int volumeBoxes() {
        return  width * height * depth;

    }
}


