import java.util.Scanner;

public class CheckHexaDecimalNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if the given number is HexaDecimal or not!!");
        String hexaDecimal=sc.next();
        boolean isHexaDecimal=hexaDecimal.matches("[A-F0-9]*");
        if(isHexaDecimal) System.out.println("Given number is HexaDecimal");
        else System.out.println("Given number is not HexaDecimal");
    }
}
