package com.investec.assessment.core.base;

import com.investec.assessment.core.domain.Address;
import com.investec.assessment.core.domain.AddressType;
import com.investec.assessment.exception.InvalidAddressException;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 */
public interface AddressProcessor {

    /**
     * @param address The address to be pretty printed.
     * @return a pretty print version of an address in the format:
     * Type: Line details - city - province/state - postal code – country
     */
    String prettyPrintAddress(Address address);

    /**
     * Pretty print all the addresses in the attached file
     */
    void prettyPrintAllAddressesInFile();

    /**
     * Iterates through a json file with address objects and only prints addresses of a t
     * he given type (postal, physical, business)
     *
     * @param addressType The type of the address
     */
    void printAddressOfType(AddressType addressType);

    /**
     * @param address The address to be validated.
     * @return true if the given address is valid, otherwise throws an exception
     * @see InvalidAddressException
     */
    boolean isValid(Address address) throws InvalidAddressException;
}
