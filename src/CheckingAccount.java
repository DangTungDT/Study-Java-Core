public class CheckingAccount extends BankAccount{

    private double balanceLimit;

    public CheckingAccount(String holder, double balance, double limit) {
        super(holder, balance);
        checkBalance(balance);
        balanceLimit = limit;
    }

    public double getLimit() {
        return balanceLimit;
    }

     public void setLimit(double limit) {
        balanceLimit = limit;
     }

     @Override
     public void print() {
         System.out.println("id:" + getId() + "\tholder: " +getHolder() + "\tbalance: " +getBalance() + "\tlimit: " + balanceLimit);
     }

    @Override
    public Boolean deposit(double depositAmount) {
        try{
            if(depositAmount <= 0) {
                throw new IllegalArgumentException("The deposit amount can't be less than 0");
            }
            double newBalance = getBalance() + depositAmount;
            setBalance(newBalance);
            return true;
        }catch(IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public Boolean withdraw(double withdrawlAmount) {
        double newBalance = getBalance() - withdrawlAmount;
        if(newBalance < 0){
            newBalance *= -1;
        }
        if(newBalance <= balanceLimit) {
            setBalance(getBalance() - withdrawlAmount);
        }else{
            return false;
        }
        return true;
    }

    @Override
    public Boolean isBalance() {
        return null;
    }

    private void checkLimit(double limit) {
        if(limit < 0) {
            throw new IllegalArgumentException("The limit can't be less than 0");
        }
    }

    private void checkBalance(double balance) {
        if(balance < 0) {
            double negativeLimmit = balanceLimit*(-1);
            if(balance < negativeLimmit) {
                throw new IllegalArgumentException("The limit has been exceeded");
            }
        }
    }
}
