import java.util.*;
import java.util.regex.*;
public class UserRegistration
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the first name of user");
          String firstName = sc.nextLine();
          String check = "[A-Z]{1}[a-z]{2,}";
          Pattern p = Pattern.compile(check);
          Matcher m = p.matcher(firstName);
          if(m.matches())
          System.out.println("Valid");
          else
          System.out.println("Invalid");
     }
}
