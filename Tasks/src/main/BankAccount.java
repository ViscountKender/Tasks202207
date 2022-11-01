public class BankAccount {
   final int MIN_DEPOSIT_AMOUNT = 10000;
   final int AMOUNT_WITHOUT_COMMISSION = 1000;
   final double ACCOUNT_REPLENISHMENT_COMMISSION = 0.02;
   final double INDIVIDUAL_COMMISSION = 0.03;
   final double COMMISSION_LEGAL_ENTITY = 0.15;
   final double MIN_TRANSFER_SUM = 1000;
   private boolean individual;
   private double depositAccount;

   public BankAccount(boolean individual, double depositAccount) {
        this.individual = individual;
        this.depositAccount = depositAccount;

    }

    public double getDepositAccount() {
        return depositAccount;
    }

    // Проверка баланса
        public void checkBalance(){
        System.out.println("Your balance: " + depositAccount);

    }
    // Метод пополнения баланса
    public void replenishBalance(double replenishmentAmount){
        if(replenishmentAmount < MIN_DEPOSIT_AMOUNT){
            replenishmentAmount = replenishmentAmount - replenishmentAmount * ACCOUNT_REPLENISHMENT_COMMISSION;
        }
        depositAccount = depositAccount + replenishmentAmount;

        System.out.println("You topped up the balance in the amount: " + replenishmentAmount);


    }
    // Метод снятия денег
    public void withdrawMoney(double replenishmentAmount){
        if(individual = true){
            replenishmentAmount = replenishmentAmount - replenishmentAmount * INDIVIDUAL_COMMISSION;
        }else {
            replenishmentAmount = replenishmentAmount - replenishmentAmount * COMMISSION_LEGAL_ENTITY;
        }
        System.out.println("Take money : " + replenishmentAmount);
        depositAccount = depositAccount - replenishmentAmount;

    }
    // Метод перевода денег в другой банк

    public void transferMoneyAnotherBank(double transferAmount) {
        double checkDeposit = depositAccount - transferAmount;
        if (transferAmount >= MIN_TRANSFER_SUM && checkDeposit  >= 0) {
            depositAccount = depositAccount - transferAmount;

            System.out.println("Transfer money to another bank: " + transferAmount);


        }
        else {
            System.out.println("Bank transfer was not made");

        }


    }
}
