import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter table which you want to see!!");
        int table=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(table+" * " +i+" = "+ i*table);
        }
    }
}
