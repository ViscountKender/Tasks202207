package part3;

public class Square extends Figure {
    private int side;

    public Square(String colour, int side) {
        super(colour);
        this.side = side;
    }


@Override
    public double square(){
        return side*side;


    }



}
