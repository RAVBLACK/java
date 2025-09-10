import java.util.StringTokenizer;
import java.util.Scanner;

class Count{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a text: ");
String inputText=sc.nextLine();
StringTokenizer st =new StringTokenizer(inputText);
int wordcount=st.countTokens();
System.out.println("No of words in the text: "+wordcount);
}
}
