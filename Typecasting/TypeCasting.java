public class TypeCasting {
    public static void main(String[] args) {
        int a = 20;
        float implicit = a; //Implicit TypeCasting
        System.out.println("Implicit TypeCasting: "+implicit);

        long ex = 1637946346939385l;
        int explicit = (int)ex;
        System.out.println("Explicit Typecasting: "+explicit);

    }
}
