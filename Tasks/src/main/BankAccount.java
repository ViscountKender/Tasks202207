public class BankAccount {
   final int MIN_DEPOSIT_AMOUNT = 10000;
   final double ACCOUNT_REPLENISHMENT_COMMISSION = 0.02;
   final double INDIVIDUAL_COMMISSION = 0.03;
   final double COMMISSION_LEGAL_ENTITY = 0.015;
   final double MIN_TRANSFER_SUM = 1000;
   private boolean individual;
   private double depositAccount =0;

   public BankAccount(boolean individual) {
        this.individual = individual;


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
    public void withdrawMoney(double replenishmentAmount) {
        double checkDeposit = depositAccount - replenishmentAmount;
        if (checkDeposit >= 0) {
            if (individual = true) {
                depositAccount = depositAccount - (replenishmentAmount + replenishmentAmount * INDIVIDUAL_COMMISSION);
            } else {
                depositAccount = depositAccount - ( replenishmentAmount + replenishmentAmount * COMMISSION_LEGAL_ENTITY);
            }
            System.out.println("Take money : " + replenishmentAmount);
            checkBalance();

        } else {
            System.out.println("Insufficient funds in the account");
        }

    }
    // Метод перевода денег в другой банк

    public void transferMoneyAnotherBank(double transferAmount,BankAccount bankAccount) {
        double checkDeposit = depositAccount - transferAmount;
        if (transferAmount >= MIN_TRANSFER_SUM && checkDeposit  >= 0) {
            depositAccount = depositAccount - transferAmount;
            bankAccount.replenishBalanceNoCommission(transferAmount);
            System.out.println("Transfer money to another bank: " + transferAmount);
            bankAccount.checkBalanceAnotherBank();

        }
        else {
            System.out.println("Bank transfer was not made");

        }


    }
    // метод пополнения без комиссии

    private void replenishBalanceNoCommission(double replenishmentAmount){
        depositAccount = depositAccount + replenishmentAmount;
    }
    // метод проверки баланса другого счета
    private void checkBalanceAnotherBank(){
        System.out.println("Balance another bank : " + depositAccount);

    }

}