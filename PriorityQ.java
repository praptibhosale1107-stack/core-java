import java.util.*;
class PriorityQ
{ 
    public static void main (String args[])
      {
        PriorityQueue p1=new PriorityQueue();
        p1.offer("A");
        p1.offer("B");
        p1.offer("C");
        p1.offer("D");
       System.out.println(p1.peek());
       //System.out.println(p1.poll());
       //System.out.println(p1);
        p1.offer("E");
       }
}

