public class Main {
    public static void main(String[] args) {
        Square square = new Square(15);

        System.out.println(square.getSide());
        square.setSide(20);
        System.out.println(square.getSide());
        System.out.println();

        Employee employee = new Employee("Bob",45,15);

        employee.setAge(employee.getAge() + 1);
        employee.setWorkExperience(employee.getWorkExperience() + 2);
        System.out.println("Name: " + employee.getName() +  "," + " Age: " + employee.getAge() +  ","
                + " Work experience: " + employee.getWorkExperience());
        System.out.println();

        Car car = new Car("black","Ford",220);

        car.driveCar();

        System.out.println();
        BankAccount bankAccount = new BankAccount(true);
        BankAccount bankAccount1 = new BankAccount(false);

        bankAccount.checkBalance();
        System.out.println();
        bankAccount.replenishBalance(9500);
        System.out.println();
        bankAccount.withdrawMoney(200.55);
        System.out.println();
        bankAccount.transferMoneyAnotherBank(2000,bankAccount1);





    }
}
