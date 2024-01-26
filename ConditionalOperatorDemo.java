public class ConditionalOperatorDemo {
    public static void main(String[] args) {
        String result = "";
        int age = 18;

        // operand1 ? operand2 : operand3
        // operand1 (the one in parentheses) is a Boolean expression that will be evaluated.
        // operand2 is the value returned if the bool is true and operand3 if its false
        result = (age >= 18) ? "qualified to Vote!" : "too young to vote!";
        System.out.println(age + " is " + result);
    }
}