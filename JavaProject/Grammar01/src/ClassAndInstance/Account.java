package ClassAndInstance;

public class Account {

    private String accountNum;
    private double balance;

    public Account(String accountNum, double balance) {
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public Account() {
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
