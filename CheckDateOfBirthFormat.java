import java.util.Scanner;

public class CheckDateOfBirthFormat {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check if the given string is in DOB format or not!!");
        String DOB=sc.next();
        boolean isCorrectDOB=DOB.matches("[0-3]?[0-9]/[0-1]?[0-9]/[12][09][0-9][0-9]");
        if(isCorrectDOB) System.out.println("Given number is in proper DOB format");
        else System.out.println("Given number is not in proper DOB format");
    }
}