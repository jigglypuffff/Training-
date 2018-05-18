package com.cg.training.exception;



public class BankException extends RuntimeException {

	private static final long serialVersionUID = -5747133303192376267L;

	/**
	 * @param message
	 */
	public BankException(final String message) {
		super(message);

	}

}
