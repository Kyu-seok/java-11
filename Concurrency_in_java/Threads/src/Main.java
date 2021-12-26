public class Main {

    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from the main thread.");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "Hello from the annonymous class thread");
            }
        }.start();

        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from the main thread.");
    }

}
