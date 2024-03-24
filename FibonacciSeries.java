import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        int first=0,second=1,sum=1;
        System.out.println("Enter how much sequence you need!");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(first+" "+second+" ");
        for(int i=2;i<n;i++){
            sum=first+second;
            System.out.print(sum+ " ");
            first=second;
            second=sum;
        }
    }
}
