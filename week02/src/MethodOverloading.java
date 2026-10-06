public class MethodOverloading {

    // Overloading: same method name, different parameter lists
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String add(String a, String b) {
        return a + " " + b;               // for text, add means join
    }

    static double area(int side) {         // square
        return side * side;
    }

    static double area(double radius) {    // circle
        return 3.14159 * radius * radius;
    }

    static double area(double length, double width) {   // rectangle
        return length * width;
    }

    static double area(double a, double b, double c) {  // triangle (Heron's formula)
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String[] args) {
        // Example 1: add with two ints
        System.out.println("--- Example 1: add(int, int) ---");
        System.out.println("add(4, 6) = " + add(4, 6));

        // Example 2: add with three ints
        System.out.println("--- Example 2: add(int, int, int) ---");
        System.out.println("add(1, 2, 3) = " + add(1, 2, 3));

        // Example 3: add with doubles and Strings (Java picks the matching version)
        System.out.println("--- Example 3: add(double, double) and add(String, String) ---");
        System.out.println("add(2.5, 3.5) = " + add(2.5, 3.5));
        System.out.println("add(\"Object\", \"Oriented\") = " + add("Object", "Oriented"));

        // Example 4: overloaded area methods
        System.out.println("--- Example 4: area ---");
        System.out.println("Square (side 5): " + area(5));              // int version
        System.out.println("Circle (radius 5.0): " + area(5.0));        // double version
        System.out.println("Rectangle (4 x 6): " + area(4.0, 6.0));
        System.out.println("Triangle (3, 4, 5): " + area(3.0, 4.0, 5.0));
    }
}
