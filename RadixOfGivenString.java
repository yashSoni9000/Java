import java.util.Scanner;

public class RadixOfGivenString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check if given string is hexa decimal octal or Binary");
        String s=sc.nextLine();
        if(s.matches("^[^A-F0-9]+")) System.out.println("Given string isn't a number");
        else if(s.matches("[01]+")) System.out.println("Binary");
        else if(s.matches("[0-7]+")) System.out.println("Octal");
        else if(s.matches("[0-9]+")) System.out.println("Decimal");
        else if(s.matches("[A-F0-9]+")) System.out.println("HexaDecimal");
    }
}
