// ATM machine interface
import java.util.Scanner;
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true; 
        } else {
            return false; 
        }
    }
}
class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    public void displayOptions() {
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("0. Exit");
    }

    public void performTransaction(int option, Scanner scanner) {
        switch (option) {
            case 1:
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                boolean withdrawalResult = userAccount.withdraw(withdrawAmount);
                if (withdrawalResult) {
                    System.out.println("Withdrawal successful. Remaining balance: $" + userAccount.getBalance());
                } else {
                    System.out.println("Insufficient funds. Withdrawal failed.");
                }
                break;

            case 2:
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                userAccount.deposit(depositAmount);
                System.out.println("Deposit successful. Updated balance: $" + userAccount.getBalance());
                break;

            case 3:
                System.out.println("Current Balance: $" + userAccount.getBalance());
                break;

            case 0:
                System.out.println("Exiting. Thank you!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000);//minimum bala1nce is 1000 
        ATM atm = new ATM(userAccount);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to the ATM!");
            atm.displayOptions();
            System.out.print("Enter your choice: ");
            int userChoice = scanner.nextInt();
            if (userChoice < 0 || userChoice > 3) {
                System.out.println("Invalid option. Please choose a valid option.");
                continue;
            }
            atm.performTransaction(userChoice, scanner);
        }
    }
}
