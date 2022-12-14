package part03;

public class Passenger extends Airplane {
    protected static int COUNT_PASSENGER_PLANE;
    protected int contPassenger;



    public Passenger(int speed, int fuel, int fuelConsumption, int contPassenger) {
        super(speed, fuel, fuelConsumption);
        this.contPassenger = contPassenger;
        COUNT_PASSENGER_PLANE++;

    }


    @Override
    public void fly(String route, int distance) {
        super.fly(route, distance);
        System.out.println("Passengers on the plane: " + contPassenger +
                ", Number of passenger planes: " + COUNT_PASSENGER_PLANE);
    }
}
