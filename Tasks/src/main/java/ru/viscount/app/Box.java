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
    public double volumeBoxes(){
        return width * height * depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
