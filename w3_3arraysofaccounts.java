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


    void display() {
        System.out.println("Account holder name: " + name);
        System.out.println("Account type: " + type);
        System.out.println("Account no " + acctno);
        System.out.println("Account Balance: " + balance);
        System.out.println();
    }
}

class ExecuteAccountc {
    public static void main(String args[]) {
	BankAccount ba[]=new BankAccount[5];
        ba[0] = new BankAccount();
        ba[1] = new BankAccount("Sreenivas", "saving", 1234567891, 20000.00);
	ba[2]= new BankAccount("Sreenu", "saving", 1234567892, 30000.00);
	ba[3]= new BankAccount();
        ba[4]= new BankAccount("Srikanth", "saving", 1234567893, 100000.00);
	System.out.println("Five Account details: ");
	for(int i=0;i<=5;i++)
	ba[i].display();
    }
}
