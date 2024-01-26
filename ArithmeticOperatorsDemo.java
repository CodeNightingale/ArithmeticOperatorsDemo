public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        int x = 13;
        int y = 9;
        double result = 0;

        System.out.println("Variable values:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("result=" + result);

        System.out.println(); //adds new line
        System.out.println("Arithmetic Operation");

        result = x + y; //Addition
        System.out.println("Addition: x + y = " + result);

        result = x - y; //Subtraction
        System.out.println("Subtraction: x - y = " + result);

        result = x * y; //Multiplication
        System.out.println("Multiplication: x * y = " + result);

        result = x / y; //Division
        System.out.println("Division: x / y = " + result);

        result = x % y; //Gets Remainder
        System.out.println("Modulus: x % y = " + result);

        result = x++; //Increment by 1
        System.out.println("Increment: x++ = " + result);

        result = x--; //Decrement by 1
        System.out.println("Decrement: x-- = " + result);
            
    }
}
