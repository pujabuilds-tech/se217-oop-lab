public class MethodOverloading {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double area(double r) {
        return 3.14 * r * r;
    }

    static double area(double l, double w) {
        return l * w;
    }

    public static void main(String[] args) {
        System.out.println("add(2, 3) = " + add(2, 3));
        System.out.println("add(1.5, 2.5) = " + add(1.5, 2.5));
        System.out.println("Circle area = " + area(2.0));
        System.out.println("Rectangle area = " + area(3.0, 4.0));
    }
}
