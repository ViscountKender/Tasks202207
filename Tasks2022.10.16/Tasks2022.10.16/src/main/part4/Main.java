package part4;

public class Main {
    public static void main(String[] args) {

        LegalBankAccount legalBankAccount = new LegalBankAccount();
        BankAccountIndividual bankAccountIndividual = new BankAccountIndividual();
        bankAccountIndividual.refill(150);
        bankAccountIndividual.withdraw(20);
        legalBankAccount.refill(50);
        legalBankAccount.transfer(bankAccountIndividual, legalBankAccount,25);








    }

}
