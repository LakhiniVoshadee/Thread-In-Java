package lk.ijse;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("This is myRunnable");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class MyRunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("This is myRunnable2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}*/


public class Main {
    public static void main(String[] args) {

        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < 8; i++) {
                System.out.println("This is myRunnable");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        thread2.start();



        Thread thread = new Thread( () ->{
            for (int i = 0; i < 5; i++) {
                System.out.println("This is myRunnable2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        thread.start();

    }
}


//Drawable d2=()->{