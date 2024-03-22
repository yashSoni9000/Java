import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to remove white spaces from it!!");
        String s = sc.nextLine();
        RemoveWhiteSpaces instance = new RemoveWhiteSpaces(); // Create an instance
        String ans = instance.removeExtraSpaces(s);
        System.out.println(ans);
    }

    public String removeExtraSpaces(String input) {
        return input.replaceAll("\\s+", " ").trim();
    }
}