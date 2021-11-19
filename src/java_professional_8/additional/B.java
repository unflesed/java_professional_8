package java_professional_8.additional;

public class B implements Runnable{
    String word;
    boolean isSaidB = false;
    Main main;
    public B() {
    }

    public B(String word, Main main) {
        this.word = word;
        this.main = main;
    }

    public boolean isSaidB() {
        return isSaidB;
    }

    public void setSaidB(boolean said) {
        isSaidB = said;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            setSaidB(main.say(word, isSaidB()));
        }
    }
}
