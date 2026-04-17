
public class Exceptionhand2
{
    public static void main (String args[])
      {
         System.out.println("Exception Handling..");
     //   try
      // { 
        // String s="sd";
        // System.out.println(s.length());
      // }
     // catch(NullPointerException e) 
     //  {
       //     System.out.println(e);
      // }
        try
        { 
         String  s=null;
         System.out.println(s.length());
         int n;
         n=10/5;
         System.out.println("Ans:="+n);
         }
         catch(ArithmeticException e)
         {
            System.out.println(e);
         }
          catch(NullPointerException ee) 
          {
              System.out.println(ee);
           }

         System.out.println("NOrmal Flow 1..");
         System.out.println("NOrmal Flow 2..");
         System.out.println("NOrmal Flow 3..");
         System.out.println("NOrmal Flow 4..");
         System.out.println("NOrmal Flow 5..");

         System.out.println("NOrmal Flow 100..");


      }
}