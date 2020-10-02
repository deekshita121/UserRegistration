import java.util.*;
import java.util.regex.*;
public class UserRegistration
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the emailId of user");
          String emailId = sc.nextLine();
          String check = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
          if(emailId.matches(check))
          System.out.println("Valid");
          else
          System.out.println("Invalid");
     }
}
