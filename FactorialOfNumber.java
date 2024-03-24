import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args){
        System.out.println("Enter number for factorial");
        Scanner sc = new Scanner(System.in);
        int fact=sc.nextInt();
        long ans=factorial(fact);
        System.out.println(ans);
    }
    public static long factorial(int fact){
        if(fact==1) return 1;
        return fact*(factorial(fact-1));
    }
}
