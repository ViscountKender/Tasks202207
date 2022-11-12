package part2;

public class Box extends Container {


    public Box(int side) {
        super(side);

    }
    public int volume(int side) {
        return side * side * side;

    }


}

