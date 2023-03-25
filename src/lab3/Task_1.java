package lab3;

public class Task_1 {
    public static void main(String[] args) {
        Ex1(1);
        //Ex2(1);
        //Ex3(1);
        //System.out.println(Ex4(4));
        //System.out.println(Ex5(4));
    }
    public static void Ex1(int x){
        System.out.println("x = " + x);
        if ((2 * x + 1) < 20){
            Ex1(2 * x + 1);
        }
    }
    public static void Ex2(int x){
        if ((2 * x + 1) < 20){
            Ex2(2 * x + 1);
        }
        System.out.println("x = " + x);
    }
    static int step = 0;
    public static void Ex3(int x){
        System.out.println("" + x + "-> ");
        step++;
        if ((2 * x + 1 )< 20){
            Ex3(2 * x + 1);
        }
        step--;
        System.out.println("" + x + " <-");
    }
    public static int Ex4(int x){
        int result;
        if (x == 1){
            return 1;
        }else {
            result = Ex4(x - 1) * x;
            return result;
        }
    }
    public static int Ex5(int x){
        if (x == 0){
            return 0;
        }
        else if (x == 1) {
            return 1;
        }
        else {
            return Ex5(x - 2) + Ex5(x - 1);
        }
    }

}