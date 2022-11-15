package part4;

public class BankAccountIndividual extends BankAccount {
    final double COMMISSION = 0.02;


    //  метод снятия денег со счета с комиссией

    @Override
    public void withdraw(double amount) {
        double amountTemp = amount - amount * COMMISSION;
        super.withdraw(amountTemp);

    }

    // метод пополнения депозита с комиссией

    @Override
    public void refill(double amount) {
        double amountTemp = amount - amount * COMMISSION;

        super.refill(amountTemp);
    }
    // Метод перевода денег в другой банк
    public void transfer(BankAccountIndividual bankAccountIndividual, LegalBankAccount legalBankAccount, double amount){
        bankAccountIndividual.withdraw(amount);
        legalBankAccount.refill(amount);

    }
}
