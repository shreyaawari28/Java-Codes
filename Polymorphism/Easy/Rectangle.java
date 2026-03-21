public class Rectangle extends Shape{

    double length,breadth;
    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }

    void calculateArea(){
        double area = length * breadth ;
        System.out.println("Area of Rectangle is: "+area);

    }
}
