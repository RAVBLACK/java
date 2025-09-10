class Parent
{
   void show()
  {
    System.out.print("Parent class");
  
 }
}
class Child extends Parent
{
 void show()
{
  System.out.print("Child class");
}
}
class MethOverride
{
public static void main(String[] args)
{
Child c=new Child();
 c.show();
}
}










