public class Main {
    public static void main(String[] args) {
        Square square = new Square(15);
        int side = square.getSide();
        System.out.println(square.getSide());
        square.setSide(20);
        System.out.println(square.getSide());
        Employee employee = new Employee("Bob",45,15);
        employee.setAge(employee.getAge() + 1);

        employee.setWorkExperience(employee.getWorkExperience() + 2);
        System.out.println("Name: " + employee.getName() +  "," + " Age: " + employee.getAge() +  ","
                + " Work experience: " + employee.getWorkExperience());
        Car car = new Car("black","Ford",220);
        car.driveByCar();

        System.out.println();
        BankAccount bankAccount = new BankAccount(true,500);

        bankAccount.checkBalance();
        bankAccount.replenishBalance(9500);
        bankAccount.transferMoneyAnotherBank(2000);
        bankAccount.withdrawMoney(200.55);
        bankAccount.checkBalance();




    }
}
