import java.io.OptionalDataException;
import java.util.Arrays;

public class ForLoopTest_1 {

    public static void main(String[] args) {

        //int i;

        // For loop
//        for( i=2; i<5 && i%2==0 ; i++ )
//        {
//            System.out.println("Even no. & less than 5 "+ i);
//        }
//        // How can we achieve Even no. & less than 5 in output ?????

//        for( int i=0, j=0, k=2; i<5 && j<3 ; System.out.println("iterate"))
//        {
//         System.out.println("java is fun");
//         break;
//        }

        // for loop to print array

        int[] abc = {2,4,6,8};

        for(int i = 0; i< abc.length; i++)
        {
            System.out.println("print array through for loop "+abc[i]);
        }


        // For each loop

        int[] array = new int[] { 1,4,2,6};

        for ( int shubham : array)

            System.out.println("print array through for each loop="+shubham);

        System.out.println(Arrays.toString(array)); // ?????









    }
}
