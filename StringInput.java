import java.lang.*;
import java.util.*;

public class StringInput{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name!!");
		String name;
		name=sc.nextLine();
		System.out.println("Hey "+name+"!! How are you??");
	}
}