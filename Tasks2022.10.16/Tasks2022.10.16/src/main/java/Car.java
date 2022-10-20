public class Car {
    final String model;
    final int year;
    String master;
    int currentSpeed;

    public Car(String model, int year, String master, int currentSpeed) {
        this.model = model;
        this.year = year;
        this.master = master;
        this.currentSpeed = currentSpeed;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public void driveCity(){
        if (currentSpeed <= 60){
            System.out.println("Car is drive");
        } else {
            System.out.println("Car isn't drive");
        }

    }
    public void driveLivingSector(){
        if(currentSpeed <=20){
            System.out.println("Car is drive");
        } else {
            System.out.println("Car isn't drive");
        }
    }

}
