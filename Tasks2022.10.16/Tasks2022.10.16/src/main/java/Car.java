public class Car {
   static final int CITY_LIMIT = 60;
    static final int YARD_LIMIT = 20;
    final String MODEL;
    final int year;
    String owner;
    int currentSpeed;


    public Car(String MODEL, int year, String master, int currentSpeed) {
        this.MODEL = MODEL;
        this.year = year;
        this.owner = master;
        this.currentSpeed = currentSpeed;
    }

    public Car(String MODEL, int year) {
        this.MODEL = MODEL;
        this.year = year;
    }
    public void driveCity(){
        if (currentSpeed <= CITY_LIMIT){
            System.out.println("Car is drive");
        } else {
            System.out.println("Car isn't drive");
        }

    }
    public void driveLivingSector(){
        if(currentSpeed <= YARD_LIMIT){
            System.out.println("Car is drive");
        } else {
            System.out.println("Car isn't drive");
        }
    }

}
