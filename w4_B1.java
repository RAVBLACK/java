class Parent
{
   int i=10;
}
class Child extends Parent
{
int i=30;
 void show()
{
  System.out.println("Value of i: "+i);
  System.out.println("Value of i in parent class: "+super.i);
}
}
class SuperA
{
  public static void main(String[] args)
  {
    Child c=new Child();
    c.show();
  }
}
