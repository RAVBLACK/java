import java.util.*;
class BankAccount{
String AcctName,Type;
long AcctNo;
double Balance;
Scanner s=new Scanner(System.in);
void getAcctNo(){
System.out.println("Account Number is : "+AcctNo);
}
void setAcctNo(int acctNo){
AcctNo=acctNo;
}
void getAcctBalance(){
System.out.println("Account Balance is : "+Balance);
}
void setAcctBalance(double bal){
Balance=bal;
}
void setName(String s){
AcctName=s;
}
void getName(){
System.out.println("Account Name is : "+AcctName);
}
void setType(String type){
Type=type;
}
void getType(){
System.out.println("Account Type is : "+Type);
}
public BankAccount(String Name,String T,long AccNo,double bal){
AcctName=Name;
Type=T;
Balance=bal;
AcctNo=AccNo;
}
void deposit(){
getAcctBalance();
}
void withdraw(){
double wbal;
System.out.println("Enter withdraw amount: ");
wbal=s.nextDouble();
System.out.println("Withdraw amount is: "+wbal);
Balance-=wbal;
System.out.println("Balance after withdrawing: "+Balance);
}
void display(){
getAcctNo();
getType();
getName();
}
}
class ExecuteBankAccountG{
public static void main(String[] args){
BankAccount ba=new BankAccount("abc","Savings",1234,20000.00);
ba.display();
ba.getAcctBalance();
ba.withdraw();
ba.deposit();
}
}