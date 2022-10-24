public class Employee {
    static final int DEFAULT_AGE = 18;
    static int countMen;
    static int countWomen;
    static int count;

    String name;
    int age;
    String gender;
    public Employee() {
        this.age = DEFAULT_AGE;
        count++;

    }


    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count ++;
        if (gender.equalsIgnoreCase("m")) {
            countMen++;

        }else{
            countWomen ++;
        }
    }

    public Employee(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.age = DEFAULT_AGE;
        count ++;
        if (gender.equalsIgnoreCase("m")) {
            countMen++;

        }else{
            countWomen ++;
        }
    }
    public String toString() {
        return "Person("
                + "name: " + name + '\''
                + ", age: " + age
                + ", gender: " + gender
                + ')';
    }

       public static void  summary(){

        System.out.println( "Total employees: " + count + ","+ " Men: " + countMen + "," + " Women: " + countWomen );


    }




}



