package intro;

//balance= cuenta (en ingles)

public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        balance =0;
    }

    //metodo para nueva cuenta
    void deposit(double m){
    }

    //metodo para eliminar cuenta
    public void withdraw(double m){
        balance -= m;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
