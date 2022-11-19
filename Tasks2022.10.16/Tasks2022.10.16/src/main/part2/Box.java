package part2;

public class Box extends Container {
    private int height;
    private  int depth;
    private int width;

    public Box(int height, int depth, int width) {
        this.height = height;
        this.depth = depth;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public int getWidth() {
        return width;
    }

    public int volume(Box box) {
        int volume = height * width * depth;
        System.out.println("volume box = " + volume);
        return volume;

    }


}

