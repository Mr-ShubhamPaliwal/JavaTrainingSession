

public class ArrayAssignment_2 {

    public static void main(String[] args) {

        int[] array = new int[]{2,40,2,40,6,4,3,4,4,5};

        for( int i=0;i<array.length;i++)
        {
            int count=0;
            int x = array[i];
            if(x==-1)continue;

            for( int j=0; j<array.length; j++){
                int y =array[j];

                if(y==x)
                {
                    count++;
                    y=-1;
                }
            }
            System.out.println("Frequency of "+x+"is "+count);
        }


    }
}
