/*
Student Name: Tianyi Chen
Student Number:041056592
Course & Section #: 22S_CST8288
Declaration:
This is my own original work and is free from Plagiarism.
*/
package businesslayer;

/**
 * Exception class for validation errors.
 */
public class ValidationException extends Exception {
	
    /**
     * Creates a new ValidationException with a default error message.
     */
	public ValidationException(){
		super("Data not in valid format");
	}
	
    /**
     * Creates a new ValidationException with a specified error message.
     *
     * @param message The error message.
     */
	public ValidationException(String message){
		super(message);
	}

     /**
     * Creates a new ValidationException with a specified error message and a cause.
     *
     * @param message  The error message.
     * @param throwable The cause of the exception.
     */
	public ValidationException(String message, Throwable throwable){
		super(message, throwable);
	}
	
     /**
     * Creates a new ValidationException with a specified cause.
     *
     * @param throwable The cause of the exception.
     */
	public ValidationException(Throwable throwable){
		super(throwable);
	}
}
