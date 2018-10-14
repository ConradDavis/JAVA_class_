package c14.v1.exception;

public class NoUserException extends Exception{
	public String toString() {
		return "User not exist!";
	}
}
