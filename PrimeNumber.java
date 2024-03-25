import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        System.out.println("Enter number to check if given number is prime or not");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=isPrime(n);
        System.out.println(ans?"Not a prime number!!":"Is a prime number!!");
    }
    static boolean isPrime(int n){
        boolean ans=false;
        for(int i=2;i*i<n;i++){
            if(n%i==0){
                ans=true;
                break;
            }
        }
        return ans;
    }
}
