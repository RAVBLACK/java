import java.util.*;
class Palindrome
{
  public static void main(String[] args)
{ 
  Scanner in=new Scanner(System.in);
  System.out.print("Enter the string: ");
  String str=in.nextLine();
  StringBuffer sb=new StringBuffer(str);
  String rstr=sb.reverse().toString();
  if((str.toLowerCase()).equals(rstr.toLowerCase()))
  System.out.println("The given string is a palindrome");
  else
  System.out.println("The given string is not a palindrome");
}
}
