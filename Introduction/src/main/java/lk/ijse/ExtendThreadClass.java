package lk.ijse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class MyThread extends Thread {
    public void run() {
        //code to be executed by the thread goes here
        System.out.println("Thread is running....");

    }
}
public class ExtendThreadClass {
    public static void main(String[] args) {
     MyThread myThread = new MyThread();
     myThread.start();
        }

}