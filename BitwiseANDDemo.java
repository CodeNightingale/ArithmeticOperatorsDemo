public class BitwiseANDDemo {
    public static void main(String[] args) {
        byte a = 14; //1110 (in binary)
        byte b = 5; //0101 (in binary)
        int c;
        //& (Bitwise AND): The result of the operation will be 1 if it exists in BOTH operands (it's talking about binary, the 1001011 thingy)
        c = a & b;
        System.out.println(a + " & " + b + " = " + c);

        //| (Bitwise Inclusive Or): The result of the operation will be 1 if it exists in EITHER operand
        c = a | b;
        System.out.println(a + " | " + b + " = " + c);

        //^ (Bitwise Exclusive Or): The result of the operation will be 1 if BOTH operands are different
        c = a ^ b;
        System.out.println(a + " ^ " + b + " = " + c);

        /*
         * ~(Bitwise One's Complement): Used to flip the bits, it toggles each bit form 0 to 1 or 1 to 0
         * 
         * <<(Binary Left Shift): Shifts/moves the left operands value to the left by the number of bits specified in the right operand
         * ex - 00000001 << 2 = 00000100
         * ex2 - .01010001 << 3 = 1010001000
         * 
         * >>(Binary Right Shift):
         * ex - 01001000 >> 3 = 00001001
         * ex2 - .10100001 >> 2 = 00101000
         * 
         * >>>(Unsigned Right Shift Zero Fill): Same shit, but shifted values are filled with zeros
         * ex - 01101000 >>> 2 = 00011010
         * ex2 - .10000001 >>> 2 = 00100000
         */

    }
}
