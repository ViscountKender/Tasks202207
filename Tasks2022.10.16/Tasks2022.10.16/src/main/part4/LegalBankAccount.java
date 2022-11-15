package part4;

public class LegalBankAccount extends BankAccount {
    final double COMMISSION = 0.03;
    final double TRANSFER_COMMISSION = 0.01;


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
        amount = amount- amount * TRANSFER_COMMISSION;
        legalBankAccount.withdraw(amount);
        bankAccountIndividual.refill(amount);


    }

}
