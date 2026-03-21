public class Shape {
    void calculateArea(){
        System.out.println("Calculating Area... ");
    }

    public static void main(String[] args) {
        Shape s;

        s = new Circle(2);
        s.calculateArea();

        s = new Rectangle(4,8);
        s.calculateArea();

        s = new Triangle(3,3);
        s.calculateArea();

    }
}
