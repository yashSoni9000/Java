import java.util.Scanner;

public class MatchGmailGetUserName {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your gmailID");
        String email=sc.next();
        boolean isValidEmail=email.matches("\\w*@gmail.*");
        if (isValidEmail){
            int index=email.indexOf("@");
            int indexOfDot=email.lastIndexOf(".");
            String userName=email.substring(0,index);
            System.out.println(userName);
            String domain=email.substring(indexOfDot);
            System.out.println(domain);
        }else{
            System.out.println("Not a valid email address");
        }
    }
}
