package practise.task_1;

public class PrintRunnable implements Runnable {
    String message;
    int time;

    public PrintRunnable(String message, int time) {
        this.message = message;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
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
