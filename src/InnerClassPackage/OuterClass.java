package InnerClassPackage;


    public class OuterClass {
        private int x;

        public  void outerMethod() {

            int i;
            System.out.println(x);
            InnerClass inner = new InnerClass();
            inner.innerMethod();
        }

        public class InnerClass {
            public void innerMethod() {
                x = 5; // Inner class has access to the private member of the outer class
                System.out.println("Inner class method called");
            }
        }
    }



