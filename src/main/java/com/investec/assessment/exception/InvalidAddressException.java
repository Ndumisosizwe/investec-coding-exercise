package com.investec.assessment.exception;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 *
 * Exception thrown if an Address doesn't adhere to the rules of a valid address.
 */
public class InvalidAddressException extends RuntimeException {

    public InvalidAddressException(String message, Throwable cause) {
        super(message, cause);
    }
}
