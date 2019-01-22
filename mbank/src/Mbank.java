import java.util.Arrays;
import java.util.Scanner;

public class Mbank {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String str = "";
        while(!str.equals("5")) {
            str = readInput();
            switch (str) {
                case "1":
                    System.out.println("open an account");
                    break;
                case "2":
                    System.out.println("deposit");
                    break;
                case "3":
                    System.out.println("withdaw");
                    break;
                case "4":
                    System.out.println("statement");
                    break;

                case "5":
                    System.exit(0);
                default:
                    System.out.println("invalid input");
            }
        }
        //scanner.close();
    }

    public static String readInput(){
        System.out.println("My Bank menu \n1. Open an account\n2. Deposit\n3. Withdraw\4. Statement\n5. Exit");
        System.out.print("Please enter a number (1-5)\n");
        String input = scanner.nextLine();
        return input;
    }
}
