package part2;

public class Container {

       public static void info(Box box){
        System.out.println("height: " + box.getHeight() + " depth: " + box.getDepth() + " width: " + box.getWidth());
        box.volume(box);

    }
    public static int volumeBoxes(Box [] boxes ){
        int volumeBoxes = 0;
        for (Box box: boxes) {
            volumeBoxes = volumeBoxes + box.volume(box);

        }

        return volumeBoxes;
    }
}
