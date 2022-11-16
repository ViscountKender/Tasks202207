package part2;

public class Box extends Container {
    private int height;
    private int width;

    public Box(int depth, int height, int width) {
        super(depth);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int volume(Box box) {
        int volume = height * width * getDepth();
        System.out.println("volume box = " + volume);
        return volume;

    }


}

