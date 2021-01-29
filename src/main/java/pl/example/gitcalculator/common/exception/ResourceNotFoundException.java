package pl.example.gitcalculator.common.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Class<?> resourceClass, Object resourceKey) {
        this(ExceptionMessage.RESOURCE_NOT_FOUND.format(resourceClass.getSimpleName(), resourceKey));
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }

}


