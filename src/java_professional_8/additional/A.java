package java_professional_8.additional;

public class A implements Runnable {
    String word;
    boolean isSaidA = false;
    Main main;

    public A() {
    }

    public A(String word, Main main) {
        this.word = word;
        this.main = main;
    }

    public boolean isSaidA() {
        return isSaidA;
    }

    public void setSaidA(boolean said) {
        isSaidA = said;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            setSaidA(main.say(word, isSaidA()));
        }
    }
}
