package part1;

import part1.employer.Employee;

public class Programmer extends Employee {
    private String language;

    public Programmer(String name, int experience,String language) {
        this.name = name;
        this.experience = experience;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "language ='" + language + '\'' +
                ", name ='" + name + '\'' +
                ", experience =" + experience +
                '}';
    }
}
