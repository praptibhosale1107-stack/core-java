class A
{
    void fun1()
     {
           System.out.println("First");      
     }
    void fun1(int x)
     {
          System.out.println("Second");      
     }
    void fun1(int p, int q)
    {
           System.out.println("Third");      
    }
}
class B extends A
{
    void fun1()
     {
            System.out.println("Forth");      
     }
}

class Funover
{
    public static void main()
      {
        B b1=new B();
        b1.fun1(4,2);
      }
}