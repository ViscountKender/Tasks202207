public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Mike", "m");
        Employee employee1 = new Employee("Don",25,"m");
        Employee employee2 = new Employee("April",30,"w");
        Employee employee3 = new Employee("Gadget",18,"w");
        Employee employee4 = new Employee("Raf","m");

        System.out.println(employee4);

        Employee.Summary();
        int [] array ={3,5,8,1,3,33,45};
        int d = MathUtils.spacingBetweenElements(array);
        System.out.println(d);


    }
}
