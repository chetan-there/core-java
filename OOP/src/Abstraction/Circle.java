package OOP.src.Abstraction;

public class Circle extends Shape {

    double radius;
    final double PI=3.14;

    Circle(double radius){
        this.radius=radius;
    }

    @Override
    double area() {
        return PI*radius*radius;
       }

}
