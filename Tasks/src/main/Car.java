public class Car {
    private String color;
    private String brand;
    private int maxSpeed;

    public Car(String color, String brand, int maxSpeed) {
        this.color = color;
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public void driveCar(){
        turnOn();
        startEngine();
        pushAccelerator();
        pushBrake();
        turnOff();
        stopEngine();
    }
    private void turnOn(){
        System.out.println("Car is starting");
    }
    private void startEngine(){
        System.out.println("Engine is starting");
    }
    private void pushAccelerator(){
        System.out.println("Accelerator pedal pressed");
    }
    private void pushBrake(){
        System.out.println("Brake pedal pressed");
    }
    private void turnOff(){
        System.out.println("Car is stopped");
    }
    private void stopEngine(){
        System.out.println("Engine is stopped");
    }
}

