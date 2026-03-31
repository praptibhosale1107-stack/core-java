abstract class A
{
    private int x;
    abstract void fun1();
       A()
         {
            x=3;
            System.out.println(x);
         }
}
class B extends A
{
    void fun1()
     {
      
     }
     B()
     {

     }
}
class Abstract
{
   public static void main(String args[])
    {
      B b1=new B();
    }
}




