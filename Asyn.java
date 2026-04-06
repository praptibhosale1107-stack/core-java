class USA
{
   void f1()
     {
       System.out.println("Parent f1");
     }
}

class India
{
   USA  u1=new USA()
    {
     public void f1()
        {
               System.out.println("Child f1");
        }
    };
}

class Asyn
{
  public static void main(String args[])
   {
      India i1=new India();
      i1.u1.f1();
   }

}