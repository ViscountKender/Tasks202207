public class BankAccount {
   final int MIN_DEPOSIT_AMOUNT = 10000;
   int commission ;
   final int MIN_TRANSFER_AMOUNT = 1000;
    boolean individual;

    private void checkBalance(){
        System.out.println("View balance");
    }
    public double replenishBalance(double replenishmentAmount,){
        if(replenishmentAmount < MIN_DEPOSIT_AMOUNT){
            replenishmentAmount = replenishmentAmount - replenishmentAmount * commission /100;
        }

        System.out.println("You topped up the balance in the amount: " + replenishmentAmount);

        return replenishmentAmount;
    }
    private double withdrawMoney(){
        if(individual = true){

        }
        System.out.println("Take money");
    }
    private int transferMoneyAnotherBank(int transferAmount){



        System.out.println("Transfer money to another bank");
        return transferAmount;
    }

}
