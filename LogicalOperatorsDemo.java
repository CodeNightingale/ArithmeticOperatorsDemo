public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean result;

        System.out.println("Logical Expression");

        System.out.println(); //New line: The sequel: The sequel
        System.out.println("Logical AND");

        result = x && x; //Is true
        System.out.println(x + " && " + x + " = " + result);

        result = x && y; //Is false
        System.out.println(x + " && " + y + " = " + result);

        result = y && x; //Is false
        System.out.println(y + " && " + x + " = " + result);

        result = y && y; //Is false
        System.out.println(y + " && " + y + " = " + result);

        System.out.println(); //New line: The sequel: The sequel: The sequel
        System.out.println("Logical OR");

        result = x || x; //Is true
        System.out.println(x + " || " + x + " = " + result);

        result = x || y; //Is true
        System.out.println(x + " || " + y + " = " + result);

        result = y || x; //Is true
        System.out.println(y + " || " + x + " = " + result);

        result = y || y; //Is false
        System.out.println(y + " || " + y + " = " + result);

        System.out.println(); //New line: The sequel: The sequel: The sequel: The sequel
        System.out.println("Logical NOT");

        result = !x; //Is false
        System.out.println(" ! " + x + " = " + result);

        result = !y; //Is true
        System.out.println(" ! " + x + " = " + result);

        result = !(x && y); //Is true
        System.out.println("!("+ x + " && " + y + ") = " + result);

        result = !(x || y); //Is false
        System.out.println("!("+ x + " || " + y + ") = " + result);

        
    }
}
