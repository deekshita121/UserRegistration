import java.util.*;
import java.util.regex.*;
public class UserRegistration
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the password of user");
          String password = sc.nextLine();
          String check = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@%$&*_.?])[A-Za-z0-9!@$%&*_?.]{8,}$";
          Pattern p = Pattern.compile(check);
          Matcher m = p.matcher(password);
          if(m.matches())
          System.out.println("Valid");
          else
          System.out.println("Invalid");
     }
}
