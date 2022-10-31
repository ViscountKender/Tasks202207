public class Employee {
    private String name;
    private int age;
    private int workExperience;

    public Employee(String name, int age, int workExperience) {
        this.name = name;
        if(age > 0 && age < 100) {
            this.age = age;
        }else {
            System.out.println("Incorrect age entered");
        }
        if (workExperience >= 0) {
            this.workExperience = workExperience;
        }else {
            System.out.println("Entered incorrect experience");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {

        return age;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 0 && age < 100) {
            this.age = age;
        }
    }

    public void setWorkExperience(int workExperience) {
        if (workExperience >= 0) {
            this.workExperience = workExperience;
        }
    }
}





