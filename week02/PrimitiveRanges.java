public class PrimitiveRanges {
    public static void main(String[] args) {
        System.out.println("byte    : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short   : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int     : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long    : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float   : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double  : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("char    : " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("boolean : true or false");

        // overflow: going past the maximum wraps around to the minimum
        byte smallBox = 127;
        smallBox++;
        System.out.println("byte 127 + 1 = " + smallBox);

        int bigBox = Integer.MAX_VALUE;
        bigBox = bigBox + 1;
        System.out.println("int max + 1 = " + bigBox);

        // underflow: going below the minimum wraps to the maximum
        short lowBox = Short.MIN_VALUE;
        lowBox--;
        System.out.println("short min - 1 = " + lowBox);

        // long can hold bigger numbers (note the L at the end)
        long bigNumber = 3000000000L;
        System.out.println("long value = " + bigNumber);
    }
}
