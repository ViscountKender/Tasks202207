public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", "m");
        Employee employee1 = new Employee("Don",25,"m");
        Employee employee2 = new Employee("April",30,"w");
        Employee employee3 = new Employee("Gadget",18,"w");
        Employee employee4 = new Employee("Raf","m");

        System.out.println(employee4);

        Employee.summary();
        int [] array ={45,5,8,1,3,33};
        int d = MathUtils.lengthBetweenMinAndMaxElements(array);
        System.out.println(d);

        Car car = new Car("Ford",1999,"Bob",15);
        Car car1 = new Car("BMW",1980,"Gera",120);
        Car car2 = new Car("Chevrolet", 2000,"Dilan",21);
        Car car3 = new Car("VAZ",1970,"Vadim",60);
        car.driveCity();
        car.driveLivingSector();
        car1.driveLivingSector();
        car1.driveCity();
        car2.driveCity();
        car2.driveLivingSector();
        car3.driveLivingSector();
        car3.driveCity();







    }
}
