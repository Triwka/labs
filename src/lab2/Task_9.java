package lab2;

public class Task_9 {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 3);
        Square square = new Square("blue", 4);
        Triangle triangle = new Triangle("pink", 3, 4, 5);
        System.out.println("площадь круга = " + circle.getArea());
        System.out.println("площадь квадрата = " + square.getArea());
        System.out.println("площадь треугольника = " + triangle.getArea());
    }
}


abstract class Shape {
    String color;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Shape(String color) {
        this.color = color;
    }
    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }
}
class Square extends Shape {
        int side;
        public Square(String color, int side) {
            super(color);
            this.side = side;
        }
        public int getSide() {
            return side;
        }
        public void setSide(int side) {
            this.side = side;
        }
        @Override
        public double getArea() {
            return this.side * this.side * 1.0;
        }
}
class Triangle extends Shape {
        int sideOne;
        int sideTwo;
        int sideThree;
        double perimeter;
        public Triangle(String color, int sideOne, int sideTwo, int sideThree) {
            super(color);
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
            this.perimeter = getPerimeter();
        }
        public double getPerimeter() {
            return this.sideOne + this.sideTwo + this.sideThree;
        }
        @Override
        public double getArea() {
            return this.perimeter / 2 *
                    ((this.perimeter / 2) - this.sideOne) *
                    ((this.perimeter / 2) - this.sideTwo) *
                    ((this.perimeter / 2) - this.sideThree);
        }
}
