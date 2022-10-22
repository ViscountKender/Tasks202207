public class Car {
    final String model;
    final int year;
    String owner;
    int currentSpeed;
    int cityLimit = 60;
    int yardLimit = 20;

    public Car(String model, int year, String master, int currentSpeed) {
        this.model = model;
        this.year = year;
        this.owner = master;
        this.currentSpeed = currentSpeed;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public void driveCity(){
        if (currentSpeed <= cityLimit){
            System.out.println("Car is drive");
        } else {
            System.out.println("Car isn't drive");
        }

    }
    public void driveLivingSector(){
        if(currentSpeed <=yardLimit){
            System.out.println("Car is drive");
        } else {
            System.out.println("Car isn't drive");
        }
    }

}
