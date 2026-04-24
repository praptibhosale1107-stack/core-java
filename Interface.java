interface Samsung
{
   int x=7;
   default void setMic()
    {
    }
   static void setCam()
    {
    }
}
interface IPhone
{
   default void setMic()
    {
  
    }
}
class Vivo implements Samsung,IPhone
{
    public void setMic()
    {
       System.out.println("Mic is set");
    }
    void setMusic()
    {

    }
}
class Interface
{
   public static void main(String args[])
    {
      Vivo v1=new Vivo();
      v1.setMic();
    }
}
