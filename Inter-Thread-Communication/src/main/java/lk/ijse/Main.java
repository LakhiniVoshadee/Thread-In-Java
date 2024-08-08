package lk.ijse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Q{
    int num;
    boolean value = false;
    public synchronized void put(int num){
        while (value){

        }
        System.out.println("PUT" + num);
        value = true;
        notify();
        this.num = num;
    }

    public synchronized void get(){
        while (!value){

        }
        System.out.println("GET:"+num);
        value = false;
        notify();
    }
}

class Producer implements Runnable{
    Q q;

    public Producer(Q q){
        this.q = q;
        Thread t = new Thread(this,"Producer");
        t.start();
    }

    @Override
    public void run() {
        int i = 0;
        while(true){

            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{
    Q q;

    public Consumer(Q q){
        this.q = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }


    @Override
    public void run() {
        while(true){
            q.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Q q = new Q();
         new Producer(q);
         new Consumer(q);

    }
}