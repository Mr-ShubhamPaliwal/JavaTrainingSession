package threadPackage.threadTC_1;

public class ShubhamThread extends Thread{

    public ShubhamThread(String name){

        super.setName(name);
    }

    @Override
    public void run() {
        // This Method logic to execute in thread
        // Print 1-10 numbers

        for( int i=0; i<10; i++){
            System.out.println("Printing numbers"+ i+ "from thread"+ getName());

        }
    }
}
