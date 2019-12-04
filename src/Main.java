public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Calc calc = new Calc();

        float num1 = calc.inputFloat();
        String operation = calc.inputOperator();
        float num2 = calc.inputFloat();

        float result = calc.calculate(num1, num2, operation);
        calc.print("Result : " + result);

    }

}
