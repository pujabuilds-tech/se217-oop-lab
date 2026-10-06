public class MethodOverloading {

    // overloaded add methods: same name, different parameters
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // overloaded area methods
    public static double area(double radius) {
        return 3.14159 * radius * radius;            // circle
    }

    public static double area(double length, double width) {
        return length * width;                       // rectangle
    }

    public static void main(String[] args) {
        System.out.println("add(4, 6) = " + add(4, 6));
        System.out.println("add(4, 6, 10) = " + add(4, 6, 10));
        System.out.println("add(2.5, 3.5) = " + add(2.5, 3.5));

        System.out.println("Circle area (radius 3) = " + area(3.0));
        System.out.println("Rectangle area (4 x 7) = " + area(4.0, 7.0));
    }
}
