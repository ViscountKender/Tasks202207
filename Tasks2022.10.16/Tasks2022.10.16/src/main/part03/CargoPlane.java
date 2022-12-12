package part03;

public class CargoPlane extends Airplane{
    private static int COUNT_CARGO_PLANE;
    private int countCargo;
    private String cargoType;

    public static int getCountCargoPlane() {
        return COUNT_CARGO_PLANE;
    }

    public CargoPlane(int speed, int fuel, int fuelConsumption, int countCargo, String cargoType) {
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
