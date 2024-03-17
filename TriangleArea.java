import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Enter base and height of triangle:");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        float ans = 0.5f * (base * height);
//        System.out.println("Area of given triangle is==> " + (int) ans);
        System.out.printf("Area of given triangle is==> " + (int) ans);
    }
}
