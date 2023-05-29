package ExceptionPackage.tryWithResource;

public class MyResource implements AutoCloseable {

    // implementing something with constructor
    public MyResource() {
        System.out.println("Initializing Resource");
    }

    public void readingDataFromResource() throws ResourceNotAvailableException {
        System.out.println("Reading data from resource");
        ResourceNotAvailableException e = new ResourceNotAvailableException("Resource ");
        throw e;
    }
    public void closingResource(){
        System.out.println("Closing Resource");
    }
    @Override
    public void close() throws Exception {
        closingResource();
    }


}
