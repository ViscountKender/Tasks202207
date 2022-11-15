package part3;

public class Main {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Nick",25,"Therapist");
        Programmer programmer = new Programmer("Bob",30,"Development");
        doctor.info();
        programmer.info();
        Square square = new Square("Black",20);
        Circle circle = new Circle("Grey",15);
        Figure figure = new Figure("Green");


        double squareSquare = square.square();
        double squareCircle = circle.square();
        System.out.println("Square square = " + squareSquare);
        System.out.println("Square circle = " + squareCircle);
    }
}
