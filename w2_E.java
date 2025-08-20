import java.util.*;
class BankAccount{
String name,type;
int acctNo;
double balance;
double wbalance;
Scanner s=new Scanner(System.in);
public BankAccount(){
System.out.println("Enter the Name: ");
name=s.nextLine();
System.out.println("Enter the Account Type: ");
type=s.nextLine();
System.out.println("Enter the Account Number");
acctNo=s.nextInt();
System.out.println("Enter the Balance: ");
balance=s.nextDouble();
}
void deposit(){
double dat;
dat=s.nextDouble();
if(dat>0){
balance+=dat;
}
else
System.out.println("Enter valid amount");
}
void withdraw(){
wbalance=s.nextDouble();
if(wbalance>0){
balance-=wbalance;
}
else
System.out.println("Enter valid amount");
}
void display(){
System.out.println("Account Holder Name: "+name);
System.out.println("Account Number: "+acctNo);
System.out.println("Account Type: "+type);
System.out.println("Account balance: "+balance);
}
}
class ExecuteBankAccountE{
public static void main(String[] args){
BankAccount ba=new BankAccount();
ba.display();
ba.deposit();
ba.withdraw();
ba.display();
}
}