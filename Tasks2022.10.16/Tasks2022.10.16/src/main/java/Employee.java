public class Employee {
    static final int DEFAULT_AGE = 18;
    //static int COUNT_OBJECTS;
    static int countMen0;
    static int countMen1;
    static int countMen2;
    static int countWomen0;
    static int countWomen1;
    static int countWomen2;

    static int count0;
    static int count1;
    static int count2;



    String name;
    int age;
    String gender;
    public Employee() {
        this.age = DEFAULT_AGE;
        count0++;
        if (gender.equalsIgnoreCase("m")) {
            countMen0++;

        }else{
            countWomen0 ++;
        }
    }


    public Employee(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        count1 ++;
        if (gender.equalsIgnoreCase("m")) {
            countMen1++;

        }else{
            countWomen1 ++;
        }
    }

    public Employee(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.age = DEFAULT_AGE;
        count2 ++;
        if (gender.equalsIgnoreCase("m")) {
            countMen2++;

        }else{
            countWomen2 ++;
        }
    }
    public String toString() {
        return "Person("
                + "name: " + name + '\''
                + ", age: " + age
                + ", gender: " + gender
                + ')';
    }
    public static int Count(){
        return  count0 + count1 + count2;
    }
    public static int CountMen(){
        return countMen0 + countMen1 + countMen2;
    }
    public static int CountWomen(){
        return countWomen0 + countWomen1 + countWomen2;
    }
    public static void  Summary(){
        int countObjects = Count();
        int  countMen = CountMen();
        int countWomen = CountWomen();
        System.out.println( "Total employees: " + countObjects + ","+ " Men: " + countMen + "," + " Women: " + countWomen );


    }




}



