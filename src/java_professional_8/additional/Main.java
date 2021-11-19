package java_professional_8.additional;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Thread thread1 = new Thread(new A("A", main));
        Thread thread2 = new Thread(new B("B", main));
        thread1.start();
        thread2.start();
    }

    public synchronized boolean say(String word, boolean check) {
        if (check) {
            try {
                notify();
                wait(1000);
                return false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(word);
        notify();
        return true;
    }
}
