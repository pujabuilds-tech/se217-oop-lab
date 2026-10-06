public class PrimitiveRanges {
    public static void main(String[] args) {
        // Example 1: ranges of the integer types
        System.out.println("--- Example 1: integer types ---");
        System.out.println("byte  : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int   : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long  : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);

        // Example 2: floating point types
        System.out.println("--- Example 2: floating point types ---");
        // MIN_VALUE here means the smallest positive value, not the most negative
        System.out.println("float : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        // Example 3: char and boolean
        System.out.println("--- Example 3: char and boolean ---");
        System.out.println("char   : " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("boolean: true or false");

        // Example 4: overflow of int (the value wraps around)
        System.out.println("--- Example 4: int overflow ---");
        int top = Integer.MAX_VALUE;
        System.out.println("MAX + 1 = " + (top + 1));      // jumps to the minimum value
        int bottom = Integer.MIN_VALUE;
        System.out.println("MIN - 1 = " + (bottom - 1));   // jumps to the maximum value

        // Example 5: overflow with byte, and how a bigger type avoids it
        System.out.println("--- Example 5: byte overflow ---");
        byte small = Byte.MAX_VALUE;
        small++;                                           // 127 + 1 wraps to -128
        System.out.println("byte 127 + 1 = " + small);
        byte forced = (byte) 200;                          // 200 does not fit in a byte
        System.out.println("(byte) 200 = " + forced);
        long safe = (long) top + 1;                        // cast first, then add
        System.out.println("long keeps it safe: " + safe);
    }
}
