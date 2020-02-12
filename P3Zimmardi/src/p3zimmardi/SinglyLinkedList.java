package p3zimmardi;
public class SinglyLinkedList
{  private Node h;  // list header
   private Node q;
    public SinglyLinkedList()
    {  h = new Node();  // dummy node
        h.l = null;
        h.next = null;
       h.back = null;
    }
    public boolean insert(StudentListing newListing)
    {   q = h;
        Node p = h.next;
        while(p!=null && p.l.compareTo(newListing.getKey())<0)
        {
        q=p;
        p = p.next;
        }

        Node n = new Node();
        
           n.l = newListing.Clone();
           if(p != null)
           {
           p.back = n;
           }
           n.back = q;
           q.next = n;
           n.next = p;
           return true;
        
   }
public StudentListing fetch(String targetKey)
 {  Node p = h.next;
    q = h;
   
     while (p != null  && !(p.l.compareTo(targetKey) >= 0))
     {  
         q = p;
         p = p.next;
     }
     if((p.l.compareTo(targetKey)) >= 0){
        return p.l.Clone();
     }else
        return null;
  }
  public boolean delete(String targetKey)
  {  Node q = h;
      Node p = h.next;
      while (p != null && !(p.l.compareTo(targetKey) == 0))
      {  q = p;
          p = p.next;
      }
      if(p != null || !(p.l.compareTo(targetKey) <  0))
      {   q.next = p.next;
           return true;
      }
      else
           return false;
  }
  public boolean update(String targetKey, StudentListing newListing)
  {  if(delete(targetKey) == false)
         return false;
      else if(insert(newListing) == false)
        return false;
      return true;
  }
  public void showAll()
  { Node p = h.next;
     while (p != null) //continue to traverse the list
     {   System.out.println(p.l.toString( ));
          p = p.next;
     }
   }
  public class Node
  {  private StudentListing l;
      private Node next;
      private Node back;
      public Node()
     {
     }
   }// end of inner class Node
  
  public void showAllBackwards()
  {
     
    Node p = h.next; 
    q=h;
    while(p!=null){
    q=p; p=p.next;
    }
    while(q!=h){
    System.out.println(q.l);
    q = q.back;
    }
}

  
}//end SinglyLinkedList outer class

