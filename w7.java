import java.util.*;
class InsufficientException extends Exception{
double balance;
double wbalance;
double minimum=10000.00;

public InsufficientException(String msg)
{
super(msg);
}
void withdraw()
{
double balance=25000.00;
System.out.println("Current balance: "+balance);
try{
System.out.println("Withdrawal amount: ");
Scanner in = new Scanner(System.in);
double wamount=in.nextDouble();
double rembal=balance-wamount;
if(wamount > balance)
{
System.out.println("Withdrawal amount: ");
throw new InsufficientException("Insufficient balance in account...");
}
else
{
System.out.println("Transaction Successful");
System.out.println("Withdrawal Amount: "+wamount);
System.out.println("After Transaction current balance: "+rembal);
}
}
catch(InsufficientException e)
{
System.out.println("Caught "+e.getMessage());
}


}
}

class ExecuteInEx{
public static void main(String args[])
{
InsufficientException ie = new InsufficientException("Insufficient Balance in account");
ie.withdraw();
}
}
