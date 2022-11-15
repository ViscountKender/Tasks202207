package part3;

public class Square extends Figure {
    private int side;

    public Square(String colour, int side) {
        super(colour);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

@Override
    public double square(){
        return getSide()*getSide();


    }



}
