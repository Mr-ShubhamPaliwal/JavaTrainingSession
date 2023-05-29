package ExceptionPackage.tryWithResource;

public class ResourceNotAvailableException extends Exception{

    String someAdditionalMessage;

    public ResourceNotAvailableException(String someAdditionalMessage){

        this.someAdditionalMessage= someAdditionalMessage;
    }
}
