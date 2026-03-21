public class Circle extends Shape {
    double radius;
    Circle(double r){
        radius = r;
    }

    void calculateArea(){
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle is: "+area);
    }
}
