package intro;

import java.util.ArrayList;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {

     savingsAccount sv= new savingsAccount("1111");
     currentAccount cr= new currentAccount("2222");

     BankAccount bankAccount = new savingsAccount("3333");

     List<BankAccount> llistaComptes= new ArrayList<>();
     bankAccount.deposit(1000);

     llistaComptes.add(sv);
     llistaComptes.add(cr);
     bankAccount.deposit(1000);

     for (BankAccount b: llistaComptes ){
         b.deposit(1000);
     }

        System.out.printf("%s té %.2f%n", sv.getAccountNumber(), sv.getBalance());
        System.out.printf("%s té %.2f", cr.getAccountNumber(), cr.getBalance());


    }
}
