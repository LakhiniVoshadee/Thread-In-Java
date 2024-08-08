package lk.ijse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {


        Thread thread = new Thread(
                () -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Thread One");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
       // thread.start();


        Thread thread2 = new Thread(
                () -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Thread Two");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
        thread.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread.setPriority(Thread.NORM_PRIORITY);

        System.out.println(thread.getPriority());
        System.out.println(thread2.getPriority());
        System.out.println(thread2.getName());



        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
    }
}