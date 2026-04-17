
public class Exceptionhand
{
    public static void main (String args[])
      {
         System.out.println("Exception Handling..");
         try
        { 
         int n;
         n=10/5;
         System.out.println("Ans:="+n);
         }
         catch(ArithmeticException e)
         {
            System.out.println(e);
         }
         System.out.println("NOrmal Flow 1..");
         System.out.println("NOrmal Flow 2..");
         System.out.println("NOrmal Flow 3..");
         System.out.println("NOrmal Flow 4..");
         System.out.println("NOrmal Flow 5..");

         System.out.println("NOrmal Flow 100..");


      }
}