package thread.interrupt.example1;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());
        // thread.setName("Custom thread");
        thread.start();

        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {
        @Override
        public void run() {
            // do things
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                System.out.println("Exiting blocking thread");
            }
        }
    }

}
