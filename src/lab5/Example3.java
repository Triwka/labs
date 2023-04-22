package lab5;

public class Example3 {
    private static final Object lock = new Object();
    private static int number = 1;
    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            synchronized (lock){
                while (number < 10) {
                    if (number % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    }else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    lock.notifyAll();
                }
            }
        });
        Thread oddThread = new Thread(() -> {
            synchronized (lock){
                while (number < 10) {
                    if (number % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                    }else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    lock.notifyAll();
                }
            }
        });
        evenThread.start();
        oddThread.start();
    }
}
