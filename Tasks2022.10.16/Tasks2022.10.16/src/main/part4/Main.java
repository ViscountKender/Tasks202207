package part4;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccountIndividual();
        BankAccount bankAccount1 = new LegalBankAccount();
        bankAccount.refill(150);
        bankAccount.withdraw(20);
        bankAccount1.refill(50);








    }

}
