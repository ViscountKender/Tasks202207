public class BankAccount {
   final int MIN_DEPOSIT_AMOUNT = 10000;
   final int AMOUNT_WITHOUT_COMMISSION = 1000;
   final double ACCOUNT_REPLENISHMENT_COMMISSION = 0.02;
   final double INDIVIDUAL_COMMISSION = 0.03;
   final double COMMISSION_LEGAL_ENTITY = 0.15;
   final double MIN_TRANSFER_SUM = 1000;
   private boolean individual;

    public boolean isIndividual() {
        return individual;
    }

    public double getDepositAccount() {
        return depositAccount;
    }

    public void setIndividual(boolean individual) {
        this.individual = individual;
    }

    public void setDepositAccount(double depositAccount) {
        this.depositAccount = depositAccount;
    }

    private double depositAccount;

    public BankAccount(boolean individual, double depositAccount) {
        this.individual = individual;
        this.depositAccount = depositAccount;
    }


    public double checkBalance(){

      return depositAccount;

    }
    public double replenishBalance(double replenishmentAmount){
        if(replenishmentAmount < MIN_DEPOSIT_AMOUNT){
            replenishmentAmount = replenishmentAmount - replenishmentAmount * ACCOUNT_REPLENISHMENT_COMMISSION;
        }
        depositAccount = depositAccount + replenishmentAmount;

        System.out.println("You topped up the balance in the amount: " + replenishmentAmount +
                "on your account: " + depositAccount);

        return replenishmentAmount;
    }
    public double withdrawMoney(double replenishmentAmount){
        if(individual = true){
            replenishmentAmount = replenishmentAmount - replenishmentAmount * INDIVIDUAL_COMMISSION;
        }else {
            replenishmentAmount = replenishmentAmount - replenishmentAmount * COMMISSION_LEGAL_ENTITY;
        }
        System.out.println("Take money");
        return replenishmentAmount;
    }

    public double transferMoneyAnotherBank(int transferAmount) {
        double depositAccount = checkBalance();
        if (transferAmount >= MIN_TRANSFER_SUM && (depositAccount - transferAmount) >= 0) {
            depositAccount = depositAccount - transferAmount;

            System.out.println("Transfer money to another bank: " + transferAmount);

        }
        return depositAccount;

    }

}
