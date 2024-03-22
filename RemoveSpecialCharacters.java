import java.util.Scanner;

public class RemoveSpecialCharacters {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to remove special characters");
        String s=sc.next();
//        String ans=s.replace("!","").replace("@","").replace("#","").replace("$","").replace("%","").replace("^","").replace("&","").replace("*","").replace("(","").replace(")","");
//        String ans=s.replaceAll("[!@#$%^&*()]*","");
        String ans=s.replaceAll("[^a-zA-Z0-9]*","");
        System.out.println(ans);
    }
}
