package part3;

public class Programmer extends Employee {
    private String direction;

    public Programmer(String name, int age, String direction) {
        super(name, age);
        this.direction = direction;
    }
    @Override
    public void info(){
        System.out.println("Programmer");
    }
}
