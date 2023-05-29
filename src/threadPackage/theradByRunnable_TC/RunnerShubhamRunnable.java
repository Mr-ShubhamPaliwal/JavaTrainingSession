package threadPackage.theradByRunnable_TC;

public class RunnerShubhamRunnable {

    public static void main(String[] args) {

        ShubhamRunnable s1 = new ShubhamRunnable();
        ShubhamRunnable s2 = new ShubhamRunnable("s2");
        ShubhamRunnable s3 = new ShubhamRunnable("s3");

        System.out.println("matter of main thread before multi thread start - t1, t2, t3 started ");

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);

        t1.start();
        t2.start();
        t3.start();

        //This will pause main thread

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(" Thread Interrupted ");
            };

        System.out.println("matter of main thread after multi thread start - t1, t2, t3 started ");
        }




    }

