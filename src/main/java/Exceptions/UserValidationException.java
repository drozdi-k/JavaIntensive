package Exceptions;

public class UserValidationException extends RuntimeException{
    public UserValidationException(String message){
        super(message);
    }
}
