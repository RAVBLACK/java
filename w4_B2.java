class Parent
{
   void show()
  {
     System.out.println("Parent method");
  }
}
class Child extends Parent
{
 void show()
{
  System.out.println("Child method ");
  super.show();
}
}
class SuperB
{
  public static void main(String[] args)
  {
    Child obj=new Child();
    obj.show();
  }
}
