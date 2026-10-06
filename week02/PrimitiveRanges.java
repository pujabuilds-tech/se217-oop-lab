public class PrimitiveRanges {
    public static void main(String[] args) {
        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float max: " + Float.MAX_VALUE);
        System.out.println("double max: " + Double.MAX_VALUE);
        System.out.println("char: 0 to " + (int) Character.MAX_VALUE);
        System.out.println("boolean: true / false");

        byte b = 127;
        b++;
        int big = Integer.MAX_VALUE + 1;
        System.out.println("Overflow byte: " + b);
        System.out.println("Overflow int: " + big);
    }
}
