package intro;

public class savingsAccount extends BankAccount{

    public static float interestRate= 0.5f;

    public savingsAccount(String accountNumber) {
        super(accountNumber);
    }


    @Override
    void deposit(double m) {
        setBalance((getBalance()+ m) + (m * interestRate));
    }
}
