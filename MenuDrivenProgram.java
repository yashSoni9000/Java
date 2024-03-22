import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args){
        System.out.println("Menu");
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV");
        System.out.println("5. EXIT");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a,b;
        boolean temp=true;
        a=sc.nextInt();
        b=sc.nextInt();
        sc.nextLine();
        while(temp){
            System.out.println("Enter Operation to perform");
            String s=sc.nextLine();
            switch (s){
                case "ADD":
                    System.out.println(a+b);
                    break;
                case "SUB":
                    System.out.println(a-b);
                    break;
                case "MUL":
                    System.out.println(a*b);
                    break;
                case "DIV":
                    try{
                        if(b!=0){
                            double ans=(double) a/b;
                            System.out.println(ans);
                        }else{
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                    } catch (ArithmeticException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "EXIT":
                    temp=false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
                }
        }
    }
}
