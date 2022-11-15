package part3;

public class Doctor extends Employee {
    private String speciality;

    public Doctor(String name, int age, String speciality) {
        super(name, age);
        this.speciality = speciality;
    }
    @Override
    public void info(){
        System.out.println("Doctor");
    }
}
