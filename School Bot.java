import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SchoolBot {
    public static void main(String [] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);

         System.out.println("Hello! Welcome to School Bot National College! I am glad to assist you with your inquiry. May i get the following details to further assist you with your other inquiries:\n"); 
        

         System.out.print("Complete Name: ");
         String name = sc.nextLine();

         System.out.print("Address: ");
         String address = sc.nextLine();

         System.out.print("Previous School: ");
         String previousSch = sc.nextLine();

         System.out.print("Contact Number: ");
         String contactN = sc.nextLine();

         System.out.print("E-mail Address: ");
         String emailAdd = sc.nextLine();

         System.out.print("Preferred Course: ");
         String course = sc.nextLine();

        Thread.sleep(2000);
        
         System.out.print("\nHi! " + name + " Thank you for sharing your information! ");

         System.out.print("The estimated tuition fee for the program Bachelor of Science in Information Technology (BSIT) ranges from P27,000 to P31,000 per semester, depending on your preferred payment scheme. Is that okay to you?");

        Thread.sleep(2000);        

        String ok = sc.nextLine();
        if(ok.equalsIgnoreCase("Yes")){
            System.out.println("\nThat's nice to know!");
        }
          
          else if(ok.equalsIgnoreCase("No")){
                      System.out.println("We provide scholarship for students who graduated with honors. We also offer scholarship examination or the pag-ibig loyalty scholarship.");
        
          }
          
          else{
            System.out.println("Thank you.");
          }
         Thread.sleep(2000);
         System.out.println("\nWhat is your specialization?");
         
         String specialized = sc.nextLine();
         ArrayList list = new ArrayList();
         Collections.addAll(list, "Web designing ", "Game developer ", "Network & Information Security ");
         Collections.shuffle(list);
         Thread.sleep(2000);
         System.out.println(specialized + " Wow! That's Great! " + list.get(0) +".");

    }
}
