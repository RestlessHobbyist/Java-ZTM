package structure;

public class Account {
    private String owner;
    private double balance;
    private double minBalance;

    public void deposit(double amount){
        //implementation
    }
    public void withdraw(double amount){
        // implementation
    }

    public double calcCreditWorthiness(){
        return 100;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }
}
