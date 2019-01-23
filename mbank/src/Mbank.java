import com.mbank.Account;
import com.mbank.Bank;
import com.mbank.dao.AccountDAO;

import java.util.Arrays;
import java.util.Scanner;

public class Mbank {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        Bank myBank = Bank.readObject();

        System.out.println(myBank);
        AccountDAO ado = new AccountDAO(myBank);

        while(true) {
            switch (readInput()) {
                case 1:
                    System.out.println("open an account");
                    //  create an account
                    // add it to the myBank.accounts
                    // this account - newly created account needs to be saved somewhere
                    // Hashmap

                    // read the inputs
                    // create account object


                    Account acc = new Account(1l,null,null,500,"savings");
                    ado.create(acc);

                    System.out.println(myBank);

                    break;
                case 2:
                    Account userAccount = ado.get(1l);
                    if(userAccount!= null){
                        System.out.println(userAccount);
                        // transaction

                        userAccount.setBalance(userAccount.getBalance() + 500);
                    }
                    System.out.println(userAccount);

                    System.out.println("deposit");
                    break;
                case 3:
                    System.out.println("withdraw");
                    break;
                case 4:
                    System.out.println("statement");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("invalid input");
            }
        }
        //scanner.close();
    }

    public static int readInput(){
        System.out.println("My Bank menu \n1. Open an account\n2. Deposit\n3. Withdraw\4. Statement\n5. Exit");
        System.out.print("Please enter a number (1-5)\n");
        int input = scanner.nextInt();
        return input;
    }
}
