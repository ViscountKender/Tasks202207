package part2;

public class Container {
    private int side;

    public Container(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
    public static void info(Box box){
        System.out.println("side : " +  box.getSide());


    }
    public static int volumeBoxes(Box [] boxes ){
        int volumeBoxes = 0;
        for (Box box: boxes) {
            volumeBoxes = volumeBoxes + box.volume(box.getSide());

        }

        return volumeBoxes;
    }
}
