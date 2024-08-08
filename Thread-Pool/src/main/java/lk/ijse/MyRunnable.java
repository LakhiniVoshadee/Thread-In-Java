package lk.ijse;

public class MyRunnable implements Runnable {

    public String name;
    public MyRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
            System.out.println(" is running"+name);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" End Thread" + name);
    }
    }

