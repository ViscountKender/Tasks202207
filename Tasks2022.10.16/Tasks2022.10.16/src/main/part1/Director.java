package part1;

import part1.employer.Employee;

public class Director extends Employee {
   private String jobTitle;
   public Director(String name, int experience, String jobTitle){
       this.name = name;
       this.experience = experience;
       this.jobTitle = jobTitle;

   }

    @Override
    public String toString() {
        return "Director{" +
                "jobTitle ='" + jobTitle + '\'' +
                ", name ='" + name + '\'' +
                ", experience =" + experience +
                '}';
    }
}
