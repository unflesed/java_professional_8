package java_professional_8.additional;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Thread thread1 = new Thread(new A("A"));
        Thread thread2 = new Thread(new B("B"));
        thread1.start();
        thread2.start();
    }
    public synchronized void say(String word, boolean isSaid) {
        if (isSaid) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(word);
            notify();
        }
    }
}
