//CALL PARENT CLASS CONSTRUCTOR USING SUPER
class SuperClass
{
   public SuperClass(String str)
   {
      System.out.println("Base Class  Constructor "+str);
    } 
}
class SubClass extends SuperClass
{
   public SubClass(String str)
   {
      super(str);
      System.out.println("Sub Class  Constructor "+str);
    }
}
class SuperC
{
  public static void main(String[] args)
  {
     SubClass obj=new SubClass("called");
  
  }
}
