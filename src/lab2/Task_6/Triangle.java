package lab2.Task_6;

public class Triangle implements FigMethods{
    int sideOne;
    int sideTwo;
    int sideThree;
    double perimeter;
    public Triangle(int sideOne, int sideTwo, int sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.perimeter = getPerimeter();
    }
    public int getSideOne() {
        return sideOne;
    }
    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }
    public int getSideTwo() {
        return sideTwo;
    }
    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }
    public int getSideThree() {
        return sideThree;
    }
    public void setSideThree(int sideThree) {
        this.sideThree = sideThree;
    }
    @Override
    public double getPerimeter(){
        return this.sideOne + this.sideTwo + this.sideThree;
    }
    @Override
    public double getArea(){
        return this.perimeter/2*
                        ((this.perimeter/2) - this.sideOne)*
                        ((this.perimeter/2) - this.sideTwo)*
                        ((this.perimeter/2) - this.sideThree);
    }
}
