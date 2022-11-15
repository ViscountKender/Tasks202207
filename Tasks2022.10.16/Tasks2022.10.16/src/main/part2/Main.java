package part2;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(20);
        Box[] boxes = {new Box(2),new Box(20),new Box(6)};

        int volume = box.volume(box.getSide());
        System.out.println(volume);
        Container.info(box);
        int totalVolume = Container.volumeBoxes(boxes);
        System.out.println(totalVolume);

    }
}
