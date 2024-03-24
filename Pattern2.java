import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args){
        System.out.println("Enter value");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.format("%2d ",j);
            }
            System.out.println();
        }
    }
}
