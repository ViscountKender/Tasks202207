package part2;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(20,1,3);
        Box[] boxes = {new Box(2,5,1),new Box(20,2,1),
                new Box(6,1,1)};

         box.volume(box);
         System.out.println();
        Container.info(box);
        System.out.println();
        int totalVolume = Container.volumeBoxes(boxes);
        System.out.println("Total volume boxes = " + totalVolume);

    }
}
