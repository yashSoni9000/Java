import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args){
        System.out.println("Enter value");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.format("%02d ",num);
                num++;
            }
            System.out.println();
        }
    }
}
