package lab2.Task_6;

public class Task_6 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("Периметр круга = " + circle.getPerimeter() + " площадь круга = " + circle.getArea());
        System.out.println("Периметр квадрата = " + square.getPerimeter() + " площадь квадрата = " + square.getArea());
        System.out.println("Периметр треугольника = " + triangle.getPerimeter() + " площадь треугольника = " + triangle.getArea());
    }
}
