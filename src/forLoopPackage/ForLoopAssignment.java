package forLoopPackage;

public class ForLoopAssignment {

    public static void main(String[] args) {

        //Even no. less than 100
        for(int i=0; i<100; i++)
        {
            if( i%2==0)
            {
                System.out.println("Even no. less than 100 "+ i);
            }
        }

        for(int i=0;i<100; i++)
        {
            if( i%2!=0)
            {
                System.out.println("Odd no.less than 100 "+ i);
            }
        }


    }
}
