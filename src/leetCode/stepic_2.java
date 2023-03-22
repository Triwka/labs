package leetCode;

public class stepic_2 {
    public static void main(String[] args) {
        Robot robot = new Robot(0,0, Direction.DOWN);
        moveRobot(robot, -10, 20);
        System.out.println(robot.getX() + " " + robot.getY());
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    static class jony extends Robot{

        public jony(int x, int y, Direction dir) {
            super(x, y, dir);
        }

        @Override
        public int getY() {
            return 32;
        }
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot (int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {return dir;}

        public int getX() {return x;}

        public int getY() {return y;}

        public void turnLeft() {
            final int number = 32;
            if      (dir == Direction.UP)    {dir = Direction.LEFT;}
            else if (dir == Direction.DOWN)  {dir = Direction.RIGHT;}
            else if (dir == Direction.LEFT)  {dir = Direction.DOWN;}
            else if (dir == Direction.RIGHT) {dir = Direction.UP;}
        }

        public void turnRight() {
            if      (dir == Direction.UP)    {dir = Direction.RIGHT;}
            else if (dir == Direction.DOWN)  {dir = Direction.LEFT;}
            else if (dir == Direction.LEFT)  {dir = Direction.UP;}
            else if (dir == Direction.RIGHT) {dir = Direction.DOWN;}
        }

        public void stepForward() {
            if (dir == Direction.UP)    {y++;}
            if (dir == Direction.DOWN)  {y--;}
            if (dir == Direction.LEFT)  {x--;}
            if (dir == Direction.RIGHT) {x++;}
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX){
            while (robot.getDirection() != Direction.RIGHT){
                robot.turnLeft();
                //System.out.println(robot.getDirection());
            }
            while (robot.getX() != toX){
                robot.stepForward();
                //System.out.println(robot.getX());
            }
        }else {
            while (robot.getDirection() != Direction.LEFT){
                robot.turnLeft();
                //System.out.println(robot.getDirection());
            }
            while (robot.getX() != toX){
                robot.stepForward();
                //System.out.println(robot.getX());
            }
        }
        if (robot.getY() < toY){
            while (robot.getDirection() != Direction.UP){
                robot.turnLeft();
                //System.out.println(robot.getDirection());
            }
            while (robot.getY() != toY){
                robot.stepForward();
                //System.out.println(robot.getY());
            }
        }else {
            while (robot.getDirection() != Direction.DOWN){
                robot.turnLeft();
                //System.out.println(robot.getDirection());
            }
            while (robot.getY() != toY){
                robot.stepForward();
                //System.out.println(robot.getY());
            }
        }
    }
}