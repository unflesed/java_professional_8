package practise.task_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new PrintRunnable("A .", 1000));
        Thread thread2 = new Thread(new PrintRunnable(". B", 1000));
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("=====");
        for (int i = 0; i < 10; i++) {
            System.out.println("C");
        }
    }
}
