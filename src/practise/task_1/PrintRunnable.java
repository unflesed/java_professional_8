package practise.task_1;

public class PrintRunnable implements Runnable {
    String message;
    int time;

    public PrintRunnable(String message, int time) {
        this.message = message;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(message);
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
