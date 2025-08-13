import java.util.*;

class BankAccount {
	String name, type;
	int acctno;
    	double balance;
    	double wbalance;
    	Scanner s = new Scanner(System.in);

    public BankAccount() {
        name = "abc";
        type = "saving";
        acctno = 1234567890;
        balance = 10000.00;
    }

    public BankAccount(String n, String t, int an, double b1) {
        name = n;
        type = t;
        acctno = an;
        balance = b1;
    }

    void deposit() {
        double dat;
        System.out.println("Enter the amount to deposit : ");
        dat = s.nextDouble();
        if (dat > 0) {
            balance += dat;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Enter the valid amount!");
        }
    }

    void withdraw() {
        System.out.println("Enter the amount to withdraw: ");
        wbalance = s.nextDouble();
        if (wbalance > 0 ) {
            balance -= wbalance;
            System.out.println("Withdrawal successful. New balance: " + balance);

        } 
	
	else {
            System.out.println("Enter the valid amount \n");
        }
    }

    void display() {
        System.out.println("Account holder name: " + name);
        System.out.println("Account type: " + type);
        System.out.println("Account no " + acctno);
        System.out.println("Account Balance: " + balance);
        System.out.println();
    }
}

class ExecuteAccount {
    public static void main(String args[]) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount("Sreenivas", "saving", 1234567891, 20000.00);

        System.out.println("!st account holder details: \n");
        ba1.display();
        ba1.deposit();
        ba1.withdraw();
        ba1.display();

        System.out.println("2nd account holder details: \n");
        ba2.display();
        ba2.deposit();
        ba2.withdraw();
        ba2.display();
        
    }
}