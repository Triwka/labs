package lab2.Task_6;

public class Square implements  FigMethods{
    int side;

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return this.side * this.side;
    }
    @Override
    public double getPerimeter() {
        return this.side * 4;
    }
}
