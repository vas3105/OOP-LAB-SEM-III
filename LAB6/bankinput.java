import java.util.Scanner;

class Account {
    String name;
    int acc_no;
    String type;
    double balance;

    void init() {
        this.balance = 0.0;
        this.type = "savings";
    }

    void init(double b, String name, String type, int acc) {
        this.name = name;
        this.balance = b;
        this.type = type;
        this.acc_no = acc;
    }

    void deposit(int r) {
        this.balance += r;
        System.out.println("Deposit successful. Updated balance: " + this.balance);
    }

    void display() {
        System.out.println("The balance: " + this.balance);
    }

    void CI(int t) {
        this.balance += this.balance * 0.08 * t;
        System.out.println("After interest, balance is: " + this.balance);
    }

    void withdraw(int w) {
        if (balance >= w) {
            balance -= w;
            System.out.println("Withdrawal successful, balance  is: " + this.balance);
        } else {
            System.out.println("Error ");
        }
    }
}

class Savings extends Account {
    void penalty() {
        if (balance < 1000) {
            System.out.println("Low balance.");
            double fine = balance * 0.1;
            balance -= fine;
            System.out.println("A fine of " + fine + " is imposed. Updated balance: " + balance);
        }
    }

    @Override
    void withdraw(int w) {
        if (balance >= w) {
            balance -= w;
            System.out.println("Withdrawal successful. Updated balance: " + this.balance);
            penalty(); // Check penalty after withdrawal
        } else {
            System.out.println("Error: Low balance.");
        }
    }
}

class Current extends Account {
    @Override
    void CI(int t) {
        // Interest is added to the balance directly
        this.balance += this.balance * 0.0* t;
        System.out.println("After adding the interest. Updated balance: " + this.balance);
    }

    @Override
    void display() {
        System.out.println("The balance for current account: " + this.balance);
    }
}

public class bankinput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the initial balance:");
        double bal = sc.nextDouble();
        sc.nextLine(); // To consume the newline character
        
        System.out.println("Enter account holder name:");
        String name = sc.nextLine();
        
        System.out.println("Enter the account number:");
        int accNo = sc.nextInt();
        sc.nextLine(); // To consume the newline character
        
        System.out.println("Enter account type (savings/current):");
        String type = sc.nextLine();
        
        System.out.println("Enter the time period in years for interest calculation:");
        int time = sc.nextInt();
        
        Account account;
        if (type.equalsIgnoreCase("savings")) {
            account = new Savings();
        } else {
            account = new Current();
        }
        
        account.init(bal, name, type, accNo);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Accept Deposit");
            System.out.println("2. Display Balance");
            System.out.println("3. Withdraw");
            System.out.println("4. Compute Interest");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the amount to deposit:");
                    int deposita= sc.nextInt();
                    account.deposit(deposita);
                    break;

                case 2:
                    account.display();
                    break;

                case 3:
                    System.out.println("Enter amount to withdraw:");
                    int money = sc.nextInt();
                    account.withdraw(money);
                    break;

                case 4:
                    account.CI(time);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
