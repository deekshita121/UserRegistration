import java.util.*;
import java.util.regex.*;
public class UserRegistration
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the password of user");
          String password = sc.nextLine();
          String check = "(?=.*[A-Z])[a-zA-Z]{8,}";
          if(password.matches(check))
          System.out.println("Valid");
          else
          System.out.println("Invalid");
     }
}
