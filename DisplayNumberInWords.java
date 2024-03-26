import java.awt.*;
import java.util.Scanner;

public class DisplayNumberInWords {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String ans="";
        while(num>0){
            int temp=num%10;
            ans+=whatChar(temp);
            ans+=" ";
            num/=10;
        }
        String[] a=ans.split("\\s+");
//        System.out.println(a[0]);
        String finalAns="";
        for(int i=a.length-1;i>=0;i--){
            finalAns+=a[i];
            finalAns+=" ";
        }
//        Color a=new Color(111);
        System.out.println(finalAns);
    }
    public static String whatChar(int n){
        return switch (n) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> "Not valid Number";
        };
    }
}
