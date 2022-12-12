package part03;

public class Airplane {
    static final int CONSUMPTION_PER = 1000;
    protected int speed;
    protected int fuel;
    protected int fuelConsumption;

    public Airplane(int speed, int fuel, int fuelConsumption) {
        this.speed = speed;
        this.fuel = fuel;
        this.fuelConsumption = fuelConsumption;
    }

    public void fly(String route, int distance){
        if(fuel >= distance/CONSUMPTION_PER * fuelConsumption){
            System.out.println("Airplane fly enough fuel, " + "flight time: " + distance/speed);
        }
        else {
            System.out.println("Not enough fuel for the flight");
        }

    }
}
