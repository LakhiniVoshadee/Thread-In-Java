package lk.ijse;


class MyThreadR implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}



public class ImplementRunableInterface  {

    public static void main(String[] args) {
        MyThreadR myThreadR = new MyThreadR();
        Thread thread = new Thread(myThreadR);
        thread.start();
    }

}
