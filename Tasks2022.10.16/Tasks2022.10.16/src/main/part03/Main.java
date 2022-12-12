package part03;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane(1500,8000,1000);
        airplane.fly("Poland",2500);
        Passenger passenger = new Passenger(1800,1000,2000,20);
        Passenger passenger1 = new Passenger(1800,10000,1800,22);
        Passenger passenger3 = new Passenger(1900,8000,2100,25);
        passenger3.fly("RF",2000);
        Cargo cargo = new Cargo(2500,9000,2500,100,"meat");
        Cargo cargo1 = new Cargo(2800,800,2400,1000,"iron");
        Cargo cargo2 = new Cargo(1890,5000,1200,200,"groats");
        Cargo cargo3 = new Cargo(3000,9000,1800,650,"weapon");
        cargo2.fly("Europe", 2000);
        int totalPlans = passenger.COUNT_PASSENGER_PLANE + cargo.COUNT_CARGO_PLANE;
        System.out.println("Total planes: " + totalPlans);
    }
}
