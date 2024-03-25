import java.util.Scanner;

public class GCDofNumbers {
    public static void main(String[] args){
        System.out.println("Enter 2 numbers");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int ans=gcd(num1,num2);
        System.out.println("GCD of "+num1+" and "+num2+" is: "+ans);
    }
    static int gcd(int a,int b){
//        int ans=1;
//        for(int i=1;i*i<=Math.max(a,b);i++){
//            if((a%i==0)&&(b%i==0)) ans=i;
//        }
//        return ans;
        //optimised approach
        if (b == 0) {
              return a;
        }
        return gcd(b, a % b);  // Recursive call with b as new 'a' and remainder as new 'b'
    }
}
