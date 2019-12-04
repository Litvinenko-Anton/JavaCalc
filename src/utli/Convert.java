package utli;

/**
 * Java Types
 * http://developer.alexanderklimov.ru/android/java/types.php
 */

public class Convert {

    byte  b = 127;                    // 8 бит  | диапазон [-128 ... 127] | [-2^7 ... 2^7-1]
    char  c = 'C';                    // 16 бит | диапазон ['\u0000' ... '\uffff'] | [0 ... 65535]
    short s = 32767;                  // 16 бит | диапазон [-32 768 ... 32 767 | [-2^15 ... 2^15-1]
    int   i = 2147483647;             // 32 бит | диапазон [-2 147 483 648 ... 2 147 483 647] | [-2^31 ... 2^31-1]
    long  l = 9223372036854775807L;   // 64 бит | диапазон [-9 223 372 036 854 775 808 ... 9 223 372 036 854 775 807] | [-2^63 ... 2^63-1]

    boolean bool = false;             // 8 бит  | диапазон [false ... true]
    float  f = 2147483647F;           // 32 бит | диапазон [1.4e-45 ... 3.4028235e38]
    double d = 9223372036854775807D;  // 64 бит | диапазон [4.9e-324 ... 1.7976931348623157308]

    byte[] bArray = new byte[0];
    int[]  iArray = new int[2147483647];

    String st = "string"; // byte_array


    /**
     * Integer
     */

    public static int toInt(String value) {
        return Integer.parseInt(value);
    }

    public static int toInt(float value) {
        return (int) value;
    }


    /**
     * Long
     */

    public static long toLong(String value) {
        return Long.parseLong(value);
    }

    public static long toLong(float value) {
        return (long) value;
    }

    public static long toLong(double value) {
        return (long) value;
    }


    /**
     * Float
     */

    public static float toFloat(String value) {
        return Float.parseFloat(value);
    }

    public static float toFloat(int value) {
        return (float) value;
    }


    /**
     * Double
     */

    public static double toDouble(String value) {
        return Double.parseDouble(value);
    }

    public static double toDouble(int value) {
        return (double) value;
    }

    public static double toDouble(long value) {
        return (double) value;
    }


    /**
     * String
     */

    public static String toString(int value) {
        return Integer.toString(value);
    }

    public static String toString(long value) {
        return Long.toString(value);
    }

    public static String toString(float value) {
        return Float.toString(value);
    }

    public static String toString(double value) {
        return Double.toString(value);
    }

    public static String toString(boolean value) {
        return Boolean.toString(value);
    }


    /**
     * String
     */

    public static Boolean toObject(boolean value) {
        return value;
    }

    public static Integer toObject(int value) {
        return value;
    }

    public static Long toObject(long value) {
        return value;
    }

    public static Float toObject(float value) {
        return value;
    }

    public static Double toObject(double value) {
        return value;
    }

}
