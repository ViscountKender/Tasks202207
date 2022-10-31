public class Car {
    private String color;
    private String brand;
    private int maxSpeed;

    public Car(String color, String brand, int maxSpeed) {
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    private void turnOn(){
        System.out.println("Car is starting");
    }
    private void startEngine(){
        System.out.println("Engine is starting");
    }
    private void pushOnAccelerator(){
        System.out.println("Accelerator pedal pressed");
    }
    private void pushOnBrake(){
        System.out.println("Brake pedal pressed");
    }
    private void turnOf(){
        System.out.println("Car is stopped");
    }
    private void stopEngine(){
        System.out.println("Engine is stopped");
    }
    public void driveByCar(){
        turnOn();
        startEngine();
        pushOnAccelerator();
        pushOnBrake();
        turnOf();
        stopEngine();
    }
}
