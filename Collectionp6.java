import java.util.*;
class Collectionp6
{
 public static void main(String args[])
   {
      PriorityQueue p1=new PriorityQueue();
      p1.offer("A");
      p1.offer("B");      
      p1.offer("C");
      p1.offer("D");
      p1.offer("E");
      System.out.println(p1);
      System.out.println(p1.poll());
      System.out.println(p1.peek());


      p1.offer("E");
   }
}