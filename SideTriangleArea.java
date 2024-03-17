//import java.util.Scanner;
//
//public class SideTriangleArea {
//    public static void main(String[] args) {
//        System.out.println("Enter sides of triangle:");
//        Scanner sc = new Scanner(System.in);
//        int a, b, c;
//        double s, area = 0;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        s = (double) (a + b + c) / 2;
////        System.out.println(s - a);
//        try {
//            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
//                throw new invalidArea("Invalid triangle sides. All sides must be positive and satisfy the triangle inequality.");
//            }
//            area = Math.sqrt(s * ((s - a) * (s - b) * (s - c)));
//            if (area == 0) throw new invalidArea("area is 0");
//            System.out.println("Here is your area of triangle==>" + area);
//        } catch (invalidArea e) {
//            System.out.println("Here is the error==>" + e.getMessage());
//        }
//    }
//}
//
//class invalidArea extends Exception {
//    public invalidArea(String message) {
//        super(message);
//    }
//}

//----------------------------------------------------------------------------------
// without custom error handling

import java.util.Scanner;

public class SideTriangleArea {
    public static void main(String[] args) {
        System.out.println("Enter sides of triangle:");
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        double s, area;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        // Validate triangle inequality (all sides must be positive and satisfy the inequality)
        if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Error: Invalid triangle sides. All sides must be positive and satisfy the triangle inequality.");
            return;  // Exit the program if sides are invalid
        }

        s = (double) (a + b + c) / 2; // Semi-perimeter

        try {
            area = Math.sqrt(s * ((s - a) * (s - b) * (s - c)));
            System.out.println("Here is your area of triangle: " + area);
        } catch (ArithmeticException e) {
            // Optional: More specific error message for division by zero
            System.out.println("Error: Invalid triangle calculation. Check input values.");
        }
    }
}
