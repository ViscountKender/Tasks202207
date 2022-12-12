package part03;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(1500,8000,1000);
        airplane.fly("Poland",2500);
        PassengerPlane passengerPlane = new PassengerPlane(1800,1000,2000,20);
        PassengerPlane passengerPlanePlane1 = new PassengerPlane(1800,10000,1800,22);
        PassengerPlane passengerPlanePlane2 = new PassengerPlane(1900,8000,2100,25);
        passengerPlanePlane2.fly("RF",2000);
        CargoPlane cargoPlane = new CargoPlane(2500,9000,2500,100,"meat");
        CargoPlane cargoPlane1 = new CargoPlane(2800,800,2400,1000,"iron");
        CargoPlane cargoPlane2 = new CargoPlane(1890,5000,1200,200,"groats");
        CargoPlane cargoPlane3 = new CargoPlane(3000,9000,1800,650,"weapon");
        cargoPlane2.fly("Europe", 2000);
        int totalPlans = passengerPlane.getCountPassengerPlane() +cargoPlane.getCountCargoPlane();
        System.out.println("Total planes: " + totalPlans);
    }
}
