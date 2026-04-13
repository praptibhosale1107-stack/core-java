class Exception1
{
    public static void main(String args[])
    {
       int x=5;
       int y=0;
       int z;
       System.out.println("Hello");
       try
        {
           String s1=null;
           System.out.println(s1.length());
           System.out.println(x/y);
        }
       catch(Exception e1)
        {
          System.out.println(e1.getMessage());
        }
           System.out.println("Hi");   
    }
}