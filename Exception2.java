class Exception2
{
   public static void main(String args[])
    {
      int cb=5000;
      int wb=2000;
      try
       {
         if(cb>=wb)
          {
             throw new ArithmeticException("Insufficient");
          }
         
          cb=cb-wb;
          System.out.println("Money Sent");
          System.out.println("Current Balance is "+cb);
        }
      catch(ArithmeticException e1)
      {
         System.out.println(e1.getMessage());
         System.out.println("Current Balance is "+cb);
      }
      finally
       {
       System.out.println("Hii");
       }
   }
}