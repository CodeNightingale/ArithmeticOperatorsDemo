public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 5;
        boolean result;

        System.out.println(); //Adds new line
        System.out.println("Relational Operation");

        System.out.println(); //Adds new line again
        System.out.println("Equal to:");
        
        //Checks if the two values are equal
        result = x == y;
        System.out.println(x + " == " + y + " = " + result);

        result = x == z;
        System.out.println(x + " == " + z + " = " + result);

        System.out.println(); //New line woohoo
        System.out.println("Not equal to:");

        //Checks if the two values are NOT equal
        result = x != y;
        System.out.println(x + " != " + z + " = " + result);

        result = x != z;
        System.out.println(x + " != " + z + " = " + result);

        System.out.println(); //New line poggies
        System.out.println("Greater than:");

        //Checks if the first value is Greater than the second value
        result = x > y;
        System.out.println(x + " > " + y + " = " + result);

        result = x > z;
        System.out.println(x + " > " + z + " = " + result);

        System.out.println(); //New line: the sequel to "New line"
        System.out.println("Less than");

        //Checks if the first value is Less than the second value
        result = x < y;
        System.out.println(x + " < " + y + " = " + result);

        result = x < z;
        System.out.println(x + " < " + z + " = " + result);

        /*
         * There 2 more but they're both similar to "Less than" and "Greater than", except it has the funny "or equal to", which is ">=" or "<=".
         * so i won't bother with adding those in, they're pretty much the same in the context of what i'm doing anyways so no point.
         */

    }
}
