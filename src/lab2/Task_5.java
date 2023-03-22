package lab2;

public class Task_5 {
    class Rectangle{
        int width;
        int height;
        public Rectangle(int width, int height){
            setWidth(width);
            setHeight(height);
        }
        void setWidth(int width){
            this.width = width;
        }
        void setHeight(int height){
            this.height = height;
        }
        int getWidth(){
            return this.width;
        }
        int getHeight(){
            return this.height;
        }
        int getSquare(int width, int height){
            return width * height;
        }
        int getPerimeter(int width, int height){
            return (width + height) * 2;
        }
    }
}
