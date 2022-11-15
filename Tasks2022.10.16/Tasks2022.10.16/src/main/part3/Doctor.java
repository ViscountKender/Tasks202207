package part3;

public class Doctor extends Employee {
    private String Speciality;

    public Doctor(String name, int age, String speciality) {
        super(name, age);
        Speciality = speciality;
    }
    @Override
    public void info(){
        System.out.println("Doctor");
    }
}
