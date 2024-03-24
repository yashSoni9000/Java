import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args){
        System.out.println("Enter value");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=n;i>0;i--){
            for(int j=1;j<=n;j++){
                if(j<i) System.out.print("  ");
                else System.out.format(" *");
            }
            if(i<=n-1){
                for(int j=n;j>i;j--){
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
//        int mid=n/2+n;
//        int left=mid,right=mid;
//        for(int i=1;i<=n;i++){
//            for(int j=3;j<=2*n;j++){
////                System.out.print("*");
////                if(j<i) System.out.print(" ");
////                else System.out.format("* ");
//                if(j==left){
//                    for(int k=left;k<=right;k++) System.out.print("*");
//                    left--;
//                    right++;
//                }
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
    }
}
