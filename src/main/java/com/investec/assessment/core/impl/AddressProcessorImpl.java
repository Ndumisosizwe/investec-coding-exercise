package com.investec.assessment.core.impl;

import com.investec.assessment.core.base.AddressProcessor;
import com.investec.assessment.core.domain.Address;
import com.investec.assessment.exception.InvalidAddressException;

/**
 * @author Ndumi
 * @since 30-Jan-19
 */
public class AddressProcessorImpl implements AddressProcessor {

    @Override
    public String prettyPrintAddress(Address address) {
        this.isValid(address);//perform checks on address.
        return address.getType().getName() + ": " + address.getAddressLineDetail()
                + " - " + address.getCityOrTown() + " - " + address.getProvinceOrState()
                + " - " + address.getPostalCode() + " – " + address.getCountry();
    }

    @Override
    public boolean isValid(Address address) throws InvalidAddressException {
        return false;
    }
}
