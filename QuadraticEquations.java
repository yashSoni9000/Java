import java.util.Scanner;

public class QuadraticEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double determinant, r1, r2;
        System.out.println("Enter a,b,c for quadratic equation!!");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == 0) {
            System.out.println("Error: The coefficient 'a' cannot be zero.");
            return;
        }
        determinant = (b * b) - (4.0 * a * c);
        if (determinant < 0) {
            System.out.println("Roots are complex!!");
            return;
        }
        try {
            r1 = ((-b) + Math.sqrt(determinant)) / (2 * a);
            r2 = ((-b) - Math.sqrt(determinant)) / (2 * a);
            System.out.println("Here are the roots of given quadratic equation:");
            System.out.println("R1==> " + r1);
            System.out.println("R2==> " + r2);
        } catch (Exception e) {
            System.out.println("Here is the error message==>" + e.getMessage());
        }
    }
}
