package p3zimmardi;

import javax.swing.JOptionPane;
public class StudentListing
{ private String name;  // key field
   private String address;
   private double gpa;
   

   public StudentListing(String n, String a, double num )
  {  name = n;
      address = a;
      gpa = num;
  }
   public static StudentListing sl = new StudentListing("","",0);
   public String toString( )
   {   return("Name is " + name +
                    "\nAddress is " + address +
                    "\nNumber is " + gpa + "\n");
   }
   public StudentListing Clone( )
   {  StudentListing clone = new StudentListing(name, address, gpa);
      return clone;
   }
   public int compareTo(String targetKey)
   {  return(name.compareTo(targetKey));
   }
   public void setAddress(String a) // coded to demonstrate encapsulation
   {  address = a;
   }
   public void input( )
   {  name = JOptionPane.showInputDialog("Enter a name");
      address = JOptionPane.showInputDialog("Enter an address");
      gpa = Double.parseDouble((JOptionPane.showInputDialog("Enter a GPA")));
   }
   public String getKey(){
   return name;
   }
  }

