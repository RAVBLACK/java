import java.util.*;
class BankAccount{
String name,type;
int acctNo;
double balance;
double wbalance;
Scanner s=new Scanner(System.in);
public BankAccount(String name,String type,int acctNo,double balance){
this.name=name;
this.type=type;
this.acctNo=acctNo;
this.balance=balance;
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
class ExecuteBankAccountD{
public static void main(String[] args){
BankAccount ba=new BankAccount("Seenu","Saving",1234567891,20000);
ba.display();
ba.deposit();
ba.withdraw();
ba.display();
}
}