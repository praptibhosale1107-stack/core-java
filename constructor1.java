class A
{
 int x,y;
 A(int p, int q) //parameterized constructor
   {
     x=p;
     y=q;
   }
  A()  //default constructor
   {
     x=1;
     y=1;
   }
  A(int f)  //single parameter constructor
   {
     x= f;
     y= f;
   }
  void fun1()
  {
    System.out.println(x+" "+y);
  }
}

class constructor1
{
  public static void main(String args[])
   {
     A a1=new A(5,2);
     A a2=new A(6,9);
     A a3=new A();
     A a4=new A(7);
     a1.fun1();
   }
}