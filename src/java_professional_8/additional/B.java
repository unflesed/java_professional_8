package java_professional_8.additional;

public class B implements Runnable{
    String word;
    boolean isSaidB = false;

    public B() {
    }

    public B(String word) {
        this.word = word;
    }

    public boolean isSaidB() {
        return isSaidB;
    }

    public void setSaidB(boolean said) {
        isSaidB = said;
    }

    public synchronized  void  say(String word){
        if (isSaidB) {
            try {
                setSaidB(false);
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(word);
        setSaidB(true);
        notify();

    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            say(word);
        }
    }
}
