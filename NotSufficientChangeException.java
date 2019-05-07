
public class NotSufficientChangeException extends RuntimeException{
	private String message;
	
	public NotSufficientChangeException (String string) {
		this.message = string ;
		
	}
public String getMessage() {
	return message;
}

}
