public class Calculator {
    public static void main(String[] args) {

        Calculator c = new Calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2,3,3));
        System.out.println(c.add(2.5,3.5));



    }

    public static int add(int a, int b) {
        return a+b;

    }

    public static int add(int a, int b,int c) {
        return a+b+c;

    }

    public static double add(double a, double b) {
        return a+b;

    }
}
