public class Main {
    public static void main(String[] args) throws  InterruptedException {
        WaitNotify wn = new WaitNotify();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread1Function();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.thread2Function();
            }
        });

        thread1.start();
        thread2.start();


        thread1.join();
        thread2.join();

    }
}