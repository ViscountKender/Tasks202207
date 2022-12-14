package part03;

public class Cargo extends Airplane{
    protected static int COUNT_CARGO_PLANE;
    protected int countCargo;
    protected String cargoType;

    public Cargo(int speed, int fuel, int fuelConsumption, int countCargo, String cargoType) {
        super(speed, fuel, fuelConsumption);
        this.countCargo = countCargo;
        this.cargoType = cargoType;
        COUNT_CARGO_PLANE ++;
    }

    @Override
    public void fly(String route, int distance) {
        super.fly(route, distance);
        System.out.println("Cargo on the plane: " + countCargo + " " + cargoType + " Number of cargo planes: "
        + COUNT_CARGO_PLANE);
    }
}
