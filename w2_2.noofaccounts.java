import java.util.*;

class BankAccount {
	String name, type;
	int acctno;
    	double balance;
    	double wbalance;
	static int count=0;
    	Scanner s = new Scanner(System.in);

    public BankAccount() {
        name = "abc";
        type = "saving";
        acctno = 1234567890;
        balance = 10000.00;
	count++;
    }

    public BankAccount(String n, String t, int an, double b1) {
        name = n;
        type = t;
        acctno = an;
        balance = b1;
	count++;
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

	static void totalAccounts(){
	System.out.println("Total no of Accounts: "+count);
	}
}



class ExecuteAccountb {
    public static void main(String args[]) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount("Sreenivas", "saving", 1234567891, 20000.00);
	BankAccount ba3 = new BankAccount("Sreenu", "saving", 1234567892, 30000.00);
	BankAccount ba4 = new BankAccount();
        BankAccount ba5 = new BankAccount("Srikanth", "saving", 1234567893, 100000.00);
	BankAccount.totalAccounts();
	

        
    }
}


