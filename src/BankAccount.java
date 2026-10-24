import java.util.Objects;

public abstract class BankAccount {
    private  int id = 0;
    private String holder;
    private double balance;
    private static int accountCount = 0;
    public BankAccount(String holder, double balance) {
         isValidHolder(holder);
         this.holder = holder;
         this.balance = balance;
         accountCount++;
         id = accountCount;
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

    public void print() {
        System.out.println("id:" + id + "\tholder: " +holder + "\tbalance: " +balance);
    }
}
