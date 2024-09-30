package intro;

/*
Esta clase simplemente le sumamos el dinero que añade el usuario,
en la de savingsAccount le sumamos el interes
*/

public class currentAccount extends BankAccount{

    public currentAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    void deposit(double m) {
        setBalance(getBalance()+m);

    }
}
