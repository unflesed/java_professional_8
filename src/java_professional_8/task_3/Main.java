package java_professional_8.task_3;

public class Main {
    public static void main(String[] args) {
        Thread pr = new Thread(new PriorityRunner(), "first");
        Thread pt = new Thread(new PriorityThread(), "second");
        Thread pt2 = new Thread(new PriorityThread(), "third");
        pt2.setPriority(10);
        pr.setPriority(1);
        pt2.start();
        pr.start();
        pt.start();

    }
    public static void method(){
        for (int i = 1; i < 50; i++) {
            System.out.println(i);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
