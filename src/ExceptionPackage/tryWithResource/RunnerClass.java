package ExceptionPackage.tryWithResource;

public class RunnerClass {

    public static void main(String[] args) throws JobFailException {

        try ( MyResource resource = new MyResource()){

            resource.readingDataFromResource();
        }catch (ResourceNotAvailableException e){
            System.out.println("Exception raised"+ e.getMessage());
            JobFailException jobFailException = new JobFailException();
            jobFailException.initCause(e);
            throw jobFailException;
        }catch (Exception e){
            System.out.println("Exception raised "+ e.getMessage());
        }
    }
}
