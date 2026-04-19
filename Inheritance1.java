class A
{
   private int x,y;
   A(int p, int q)
     {
       x=p;
       y=q;
       System.out.println("Parent's constructor");
     }
}
class B extends A
{
   B(int m, int n)
    {
      super(m,n);
      System.out.println("Child's constructor");
    }
}

class Inheritance1
{
   public static void main(String args[])
    {
         B b1=new B(5,7);
    }
}