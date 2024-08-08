package lk.ijse;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Calculation{
    int num;
    public synchronized void increment(){
        num++;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
      Calculation cal = new Calculation();
        Thread thread = new Thread(
                () ->{
                    for (int i = 0; i < 1000; i++) {
                        System.out.println("Thread");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        cal.increment();
                    }
                }
        );

       // thread.start();



        Thread thread2 = new Thread(
                () ->{
                    for (int i = 0; i < 1000; i++) {
                        System.out.println("Thread2");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                       cal.increment();
                    }
                }
        );
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();


        System.out.println("value=" + cal.num);


    }


    }
