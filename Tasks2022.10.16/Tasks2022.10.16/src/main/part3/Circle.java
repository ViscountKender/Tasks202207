package part3;

public class Circle extends Figure {
    final double Pi = 3.141592;
    private int radius;

    public Circle(String colour, int radius) {
        super(colour);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double square() {
        return Pi * getRadius() * getRadius();
    }
}
