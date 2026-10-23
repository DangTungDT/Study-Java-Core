public class SavingsAccount extends BankAccount{


    public SavingsAccount(String holder, double balance) {
        super(holder, balance);
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
            return false;
        }
        setBalance(newBalance);
        return true;
    }

    @Override
    public Boolean isBalance() {
        return null;
    }
}
