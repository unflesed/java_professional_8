package java_professional_8.additional;

public class A implements Runnable {
    String word;
    boolean isSaidA = false;

    public A() {
    }

    public A(String word) {
        this.word = word;
    }

    public boolean isSaidA() {
        return isSaidA;
    }

    public void setSaidA(boolean said) {
        isSaidA = said;
    }

    public synchronized void say(String word) {
        if (isSaidA) {
            try {
                setSaidA(false);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println(word);
            setSaidA(true);
            notify();
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            say(word);
        }
    }
}
