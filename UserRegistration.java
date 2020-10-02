import java.util.*;
import java.util.regex.*;
public class UserRegistration
{
     public static void main(String args[])
     {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the emailId of user");
          String emailId = sc.nextLine();
          String check = "^[a-zA-Z]+[a-zA-Z0-9+_,-]+.{0,1}+[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9,]+.{0,1}+[0-9]{0,1}+[a-zA-Z,]{2,}+$";
          Pattern p = Pattern.compile(check);
          Matcher m = p.matcher(emailId);
          if(m.matches())
          System.out.println("Valid");
          else
          System.out.println("Invalid");
     }
}
