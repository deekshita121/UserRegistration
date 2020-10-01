import java.util.*;
import java.util.regex.*;
public class UserRegistration
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the last name of user");
          String lastName = sc.nextLine();
          String check = "[A-Z]{1}[a-z]{2,}";
          Pattern p = Pattern.compile(check);
          Matcher m = p.matcher(lastName);
          if(m.matches())
          System.out.println("Valid");
          else
          System.out.println("Invalid");
     }
}
