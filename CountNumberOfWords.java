import java.util.Scanner;

public class CountNumberOfWords {
    public static void main(String[] args){
        System.out.println("Enter a string to count number of words init");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        RemoveWhiteSpaces cleanedString =new RemoveWhiteSpaces();
        s=cleanedString.removeExtraSpaces(s);
        int count=0;
        if(s.isEmpty()) System.out.println("No string provided");
        else{
            count++;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if (c== ' ') count++;
            }
            System.out.println(count);
        }
    }
}
