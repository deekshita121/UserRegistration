import java.util.*;
import java.util.regex.*;
public class UserRegistration
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the phone num of user with country code");
          String phoneNum = sc.nextLine();
          String check = "[91]{2}\\s[6-9]{1}[0-9]{9}$";
          if(phoneNum.matches(check))
          System.out.println("Valid");
          else
          System.out.println("Invalid");
     }
}
