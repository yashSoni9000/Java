import java.util.Scanner;

public class OperatorOverloading {
    public static void main(String[] args){
        System.out.println("Enter 2 number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
//        float num1=sc.nextFloat();
//        float num2=sc.nextFloat();
//        int maxi=max(num1,num2);
        int maxi=max(num1,num2,num3);
//        float maxi = max(num1,num2);
        System.out.println(maxi);
    }
    static int max(int num1,int num2){
        System.out.println("in int");
        return num1>num2?num1:num2;
    }
    static float max(float num1,float num2){
        System.out.println("in float");
        return num1>num2?num1:num2;
    }
    static int max(int a,int b,int c){
        System.out.println("in three");
        if(a>b&&a>c) return a;
        else if(b>c) return b;
        else return c;
    }
}
