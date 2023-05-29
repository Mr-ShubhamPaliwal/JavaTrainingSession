package threadPackage.threadTC_1;

public class ThreadRunner {

    public static void main(String[] args) throws InterruptedException {

        ShubhamThread s1 = new ShubhamThread("S1");
        ShubhamThread s2 = new ShubhamThread("S2");
        ShubhamThread s3 = new ShubhamThread("S3");

        System.out.println("Starting S1, S2 AND S3");
        // Here sequence of thread is random and depends on OS and processor

        s1.start();
        s2.start();
        s3.start();

        Thread.sleep(10);

        System.out.println("S1 and S2 & S3 Started ");
    }
}
