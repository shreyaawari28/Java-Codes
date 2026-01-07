public class Arithmetic_Operators {
    public static void main(String[] args) {
        double a = 1.2;
        double b = 2;
        double c = 9;

        System.out.println("Value of number1 is "+a +" Value of number2 is "+b +" Value of number3 is "+c);
        System.out.println("Addition: " +(a+b+c));
        System.out.println("Subtraction: "+ (a-b-c));
        System.out.println("Multiplication: "+ (a*b*c));
        System.out.println("Division: "+ (a/b/c));
        System.out.println("Modulus operation: "+ (a%b%c));

        System.out.println("Pre increment value of number2 "+(++b));
        System.out.println("Pre decrement value of number2 "+(++b));

        //Compound operator +=
        System.out.println("Compound operation of +5 of number1 "+ (a+=5));
        System.out.println("Compound operation of -2 of number2 "+ (a-=2));
        System.out.println("Compound operation of *9 of number3 "+ (a=a*9));








    }
}
