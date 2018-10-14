package c14.v2.exception;

public class NoUserException extends Exception{
	public String toString() {
		return "User not exist!";
	}
}
