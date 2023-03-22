package lab2.Task_6;

public class Circle implements FigMethods{
    int radius;
    public Circle(int radius) {
        setRadius(radius);
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }
    @Override
    public double getPerimeter(){
        return 3.14 * 2 * this.radius;
    }
}
