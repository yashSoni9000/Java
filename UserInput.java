import java.lang.*;
import java.util.*;

class UserInput{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 2 numbers");
		int a,b,c;
		//sc.useRadix(16);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("c==>"+c);
	}
}