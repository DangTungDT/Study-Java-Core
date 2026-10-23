import java.util.Objects;

public abstract class BankAccount {
    private static  int id = 0;
    private String holder;
    private double balance;

    public BankAccount(String holder, double balance) {
         isValidHolder(holder);
         this.holder = holder;
         this.balance = balance;
         id++;
    }

    public int getId() {
        return id;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        isValidHolder(holder);
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public abstract Boolean deposit(double depositAmount);

    public abstract Boolean withdraw(double withdrawlAmount);
    public abstract Boolean isBalance();

    private static void isValidHolder(String name) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is null or empty!");
        }
    }
}
