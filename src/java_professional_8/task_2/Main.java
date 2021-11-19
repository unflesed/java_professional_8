package java_professional_8.task_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = Thread.currentThread();
        Thread myThread1 = new Thread(new Threads(), "first");
        Thread myThread2 = new Thread(new Threads(), "second");
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println("Завершение " + myThread1.getName() + " " + myThread2.getName() + " " + myThread.getName());
    }
}
class Threads extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
