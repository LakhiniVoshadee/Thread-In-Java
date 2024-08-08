package lk.ijse;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(
                () -> {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Thread 1");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );

        thread.start();
        System.out.println(thread.isAlive());
      //  thread.join();


     Thread thread2 = new Thread(
             () ->{
                 for (int i = 0; i < 5; i++) {
                     System.out.println("Thread 2");
                     try {
                         Thread.sleep(100);
                     } catch (InterruptedException e) {
                         throw new RuntimeException(e);
                     }
                 }
             }
     );

     thread2.start();
        System.out.println(thread.isAlive());
        thread.join();
        System.out.println(thread.isAlive());
        thread2.join();
        System.out.println(thread2.isAlive());


        /*thread.join();*/
        System.out.println("bye...");




    }
}