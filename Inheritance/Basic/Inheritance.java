public class Inheritance {

    public static void main(String[] args) {

        AdvCalc ac = new AdvCalc();
        int r1 = ac.add(1,2);
        int r2 = ac.sub(2,5);
        int r3 = ac.mul(3,6);
        int r4 = ac.div(7,7);

        System.out.println("Addition of 1 and 2 is: "+r1);
        System.out.println("Subtraction of 2 and 5 is: "+r2);
        System.out.println("Multiplication of 3 and 6 is: "+r3);
        System.out.println("Division of 7 and 7 is: "+r4);

    }
}
