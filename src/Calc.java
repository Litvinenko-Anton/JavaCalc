import java.text.ParseException;
import java.util.Scanner;

public class Calc {

    private Scanner scan = new Scanner(System.in);

    /**
     * Input fields
     */

    public int inputInt() {
        return inputInt("Enter Int Number : ");
    }

    public float inputFloat() {
        return inputFloat("Enter Int Number : ");
    }

    public String inputOperator() {
        return inputString("Enter Operator : ");
    }

    public int inputInt(String message) {
        print("Enter Int Number : ");
        return scan.nextInt();
    }

    public float inputFloat(String message) {
        print("Enter Float Number : ");
        return scan.nextFloat();
    }

    public String inputString(String message) {
        print(message);
        return scan.next().trim();
    }

    public void print(String message) {
        System.out.print(message);
    }

    public void print(String message, long value) {
        System.out.print(message);
        System.out.print(value);
    }

    public void print(String message, double value) {
        print(message, value, 2);
    }

    public void print(String message, double value, int round) {
        System.out.print(message);
        String format = "%." + round +"f"; // result "%.2f"
        System.out.printf(format, value);
    }

    /**
     * Calculate int
     */

    public int add(int x, int y) {
        int result = x + y;
        return result;
    }

    public int sub(int x, int y) {
        int result = x - y;
        return result;
    }

    public int mult(int x, int y) {
        int result = x * y;
        return result;
    }

    public int div(int x, int y) {
        int result = x / y;
        return result;
    }

    /**
     * Calculate float
     */

    public float add(float x, float y) {
        float result = x + y;
        return result;
    }

    public float sub(float x, float y) {
        float result = x - y;
        return result;
    }

    public float mult(float x, float y) {
        float result = x * y;
        return result;
    }

    public float div(float x, float y) {
        float result = x / y;
        return result;
    }

    public float calculate(float x, float y, String operator) {
        if (operator.equals("+")) {
            return add(x, y);
        } else if (operator.equals("-")) {
            return sub(x, y);
        } else if (operator.equals("*")) {
            return mult(x, y);
        } else if (operator.equals("/")) {
            return div(x, y);
        } else {
            throw new RuntimeException("Unknown operator '" + operator + "'");
        }
    }
}
