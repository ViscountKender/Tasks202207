package part4;

public class BankAccount {
    private double deposit = 0;

    // метод снятия денег со счета

    public void withdraw(double amount) {
        if (deposit > 0 && deposit >= amount) {
            deposit = deposit - amount;

        }
        System.out.println("Deposit: " + deposit);

    }

    // метод пополнения депозита
    public void refill(double amount){
        if (amount >=0) {
            deposit = deposit + amount;
        }
        System.out.println("Deposit: " + deposit);

    }


}
