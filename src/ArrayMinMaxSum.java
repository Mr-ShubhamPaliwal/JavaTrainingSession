public class ArrayMinMaxSum {

    public static void main(String[] args) {

        // find min from array
//        int[] a = new int[]{3,4,2,7,9};
//
//        int minimumNumber=a[0];
//
//        for( int i=0; i<a.length; i++){
//
//            if(minimumNumber<a[i]){
//
//                minimumNumber=a[i];
//
//
//            }
//
//            }
//        System.out.println(minimumNumber);
//        }


        //sum of array

        int[] a = new int[]{3, 4, 2, 7, 9};//25

        int sum = a[0];
        int len = a.length;

        for(int i=1;i<a.length; i++)

        {
                sum += a[i];

            }
            System.out.println(sum);




        }


    }


