package threadPackage.theradByRunnable_TC;

public class ShubhamRunnable implements Runnable {

    String name;

    public ShubhamRunnable(String name) {
        this.name = name;
    }

    public ShubhamRunnable() {

    }


    @Override
    public void run() {
        // This Method logic to execute in thread
        // Print 1-10 numbers

        for( int i=0; i<10; i++){
            System.out.println("Printing numbers "+ i+ " from thread "+ name);

        }

    }
}
