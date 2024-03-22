import java.util.Scanner;

public class CheckBinaryNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Check if number is Binary or not!!");
        String binaryDigit=sc.next();
        boolean isBinary=binaryDigit.matches("[01]*");
        if(isBinary) System.out.println("Number is Binary");
        else System.out.println("Number is Not Binary");
    }
}
