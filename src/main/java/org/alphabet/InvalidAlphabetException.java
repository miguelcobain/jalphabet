package org.alphabet;

public class InvalidAlphabetException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidAlphabetException(String message) {
		super(message);
	}
}
