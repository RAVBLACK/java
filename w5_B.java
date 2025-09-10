import java.util.*;
class StringSort
{
  public static void main(String[] args)
{ 
  String names[]=new String[5];
  Scanner scan=new Scanner(System.in);
  System.out.print("Enterthe names: ");
  for(int i=0;i<5;i++)
  names[i]=scan.nextLine();
  int size=names.length;
  System.out.print("Total: "+size);
  System.out.println("Before sorting: ");
  for(int i=0;i<5;i++)
  System.out.print(names[i]);
  for(int i=0;i<size;i++)
{
 for(int j=i+1;j<size;j++)
 {
   if(names[i].compareTo(names[j])>0)
   { 
     String temp=names[i];
     names[i]=names[j];
     names[j]=temp;
   }
 }
}
System.out.println("After sorting: ");
  for(int i=0;i<5;i++)
  System.out.print(names[i]);
 
}
}
