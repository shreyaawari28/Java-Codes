public class Bitwise {
    public static void main(String[] args) {
        int a = 5;
        int b= 2;

        System.out.println("Binary of 5 is "+ (Integer.toBinaryString(a)));
        System.out.println("Binary of 2 is "+ (Integer.toBinaryString(b)));

        //AND
        System.out.println("Performing Bitwise AND on 5 & 2: "+((Integer.toBinaryString(a & b))));

        //OR
        System.out.println("Performing Bitwise OR on 5 & 2: "+((Integer.toBinaryString(a | b))));

        //XOR
        System.out.println("Performing Bitwise XOR on 5 & 2: "+((Integer.toBinaryString(a ^ b))));

        //NOT
        System.out.println("Performing Bitwise NOT on 5: "+((Integer.toBinaryString(~a))));

        //Right Shift
        System.out.println("Performing Bitwise Right Shift on 5 & 2: "+((Integer.toBinaryString(a>>b))));

        //Left Shift
        System.out.println("Performing Bitwise Left Shift on 5 & 2: "+((Integer.toBinaryString(a<<b))));

        //Unsigned Right Shift
        System.out.println("Performing Bitwise Unsigned Right Shift on 5 & 2: "+((Integer.toBinaryString(a>>>b))));
    }
}
