/*

    Grade = 95% Deleting a node not in the structure gave a null pointer exception



*/
package p3zimmardi;

import javax.swing.JOptionPane;


public class Main {
    
   public static void main(String[] args) {
    SinglyLinkedList ds = new SinglyLinkedList();
    String a = JOptionPane.showInputDialog("How many Students are there?");
    int n = Integer.parseInt(a);

    for(int i=n; i>=1; i--)
    {
        StudentListing.sl.input();
        ds.insert(StudentListing.sl);    
    }
    
                
            boolean flag = true;
            while(true){
                String x = JOptionPane.showInputDialog("Choose from the following Menu.\n"
            + "1. Add a new Student\n"
            + "2. Search Student Information\n"
            + "3. Delete a Student\n"
            + "4. Update an Existing Student.\n"
            + "5. Show all Existing Students\n"
            + "6. Show all backwards.\n"
            + "7. Exit the program.\n"
    );
            int choice = Integer.parseInt(x);

            switch(choice)
            {
            
                case 1:  StudentListing newSL = new StudentListing("","",0);
                        newSL.input();
                        ds.insert(newSL);
                    
                    break;
                case 2: String key = JOptionPane.showInputDialog("Who would you like to fetch?");
                        StudentListing result = ds.fetch(key);
                        System.out.println(result);
                    break;
                case 3: String keyDelete = JOptionPane.showInputDialog("Who would you like to delete?");
                        boolean deleteStatus = ds.delete(keyDelete);
                        if(deleteStatus == true)
                        {
                            System.out.println("Listing Successfully deleted");
                        }
                        else
                        {
                            System.out.println("Node not found\nDelete was Unsuccessful");
                        }
                    break;
                case 4: String oldListing = JOptionPane.showInputDialog("Who would you like to update?");
                        StudentListing tempListing = new StudentListing("","",0);
                        tempListing.input();
                        boolean updateStatus = ds.update(oldListing,tempListing);
                        if(updateStatus == true)
                        {
                            System.out.println("Listing Successfully updated");
                        }
                        else
                        {
                            System.out.println("Update was not Successful");
                        }
                        
                    break;
                case 5: ds.showAll();
                    break;
                case 6: ds.showAllBackwards();
                    break;
                case 7:flag = false;
                        System.exit(0);
                    break;
                default: System.exit(0);                  
            }
            }
   }
}

