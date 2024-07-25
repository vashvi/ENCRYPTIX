import java.util.Scanner;

public class ATM {
    public static User user = new User(1000);

    public static void withdraw(int amount){
        System.out.println("-".repeat(50));
        int curr = user.getAccBalance();
        if (amount>curr)
            System.out.println("Insufficient Bank Balance");
        else {
            System.out.println("Please Collect your CASH.");
            System.out.println("Withdrawal Amount : " + amount);
            System.out.println("Current Balance : "+(curr-amount));
            user.setAccBalance(curr-amount);
        }
        System.out.println("-".repeat(50));

    }
    public static void deposit(int amount){
        System.out.println("-".repeat(50));

        int curr = user.getAccBalance();
        user.setAccBalance(curr+amount);
        System.out.println("Amount Deposited successfully");
        System.out.println("Deposited Amount : "+amount);
        System.out.println("Your current bank balance is : "+user.getAccBalance());
        System.out.println("-".repeat(50));

    }
    public static void checkBalance(){
        System.out.println("-".repeat(50));

        System.out.println("Your current Bank balance is : "+user.getAccBalance());
        System.out.println("-".repeat(50));

    }

    public static void choice(int choice){
        int amount;
        switch (choice){
            case 1:
                System.out.println("Enter the amount of money you want to withdraw");
                amount = new Scanner(System.in).nextInt();
                withdraw(amount);
                break;
            case 2:
                System.out.println("Enter the amount of money you want to deposit");
                amount = new Scanner(System.in).nextInt();
                deposit(amount);
                break;
            case 3:
                checkBalance();
                break;
            case 4:
                System.out.println("Thank You for using the ATM..!");
                System.exit(0);
                break;
            default:
                System.out.println("Wrong Choice");
                break;
        }
        return;
    }

    public static void main(String[] args) {
        while (true){
            System.out.println("Welcome to ATM \n1. Enter 1 to withdraw money.\n2. Enter 2 to deposit money.\n3. Enter 3 for checking the balance. \n4. Exit");
            int choice = new Scanner(System.in).nextInt();
            choice(choice);
        }
    }
}
class User{
    private int accBalance;
    User(int defaultamount){
        this.accBalance = defaultamount;
    }

    public int getAccBalance() {
        return accBalance;
    }
    public void setAccBalance(int amount){
        accBalance = amount;
    }
}
