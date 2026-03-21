import java.awt.geom.Area;

public class Triangle extends Shape{
    double width, height;
    public Triangle(double w, double h){
        width = w;
        height = h;


    }

    void calculateArea(){
        double area = width * height ;
        System.out.println("Area of Triangle is: "+area);

    }
}

