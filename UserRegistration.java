import java.util.*;
import java.util.regex.*;
public class UserRegistration
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the password of user");
          String phoneNum = sc.nextLine();
          String check = "[a-zA-Z]{8,}";
          if(phoneNum.matches(check))
          System.out.println("Valid");
          else
          System.out.println("Invalid");
     }
}
