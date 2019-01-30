package com.investec.assessment.core.impl;

import com.investec.assessment.core.base.AddressProcessor;
import com.investec.assessment.core.domain.Address;
import com.investec.assessment.core.domain.AddressType;
import com.investec.assessment.exception.InvalidAddressException;
import com.investec.assessment.util.AddressUtil;
import com.investec.assessment.value.AddressLineDetail;

import java.util.Arrays;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 */
public class AddressProcessorImpl implements AddressProcessor {

    @Override
    public String prettyPrintAddress(Address address) {
        //this.isValid(address);
        return address.getType().getName() + ": " + address.getAddressLineDetail()
                + " - " + address.getCityOrTown() + " - " + address.getProvinceOrState()
                + " - " + address.getPostalCode() + " – " + address.getCountry();
    }

    @Override
    public boolean isValid(Address address) {
        if (!address.getPostalCode().matches("[0-9]+")) {
            throw new InvalidAddressException("Postal code must be numeric");
        }
        if (address.getCountry() == null) {
            throw new InvalidAddressException("Address does not have a country.");
        }
        if (address.getCountry().getCode().equalsIgnoreCase("ZA") && address.getProvinceOrState() == null) {
            throw new InvalidAddressException("A province is required if the country is ZA.");
        }
        if (address.getAddressLineDetail() != null) {
            AddressLineDetail addressLineDetail = address.getAddressLineDetail();
            if (addressLineDetail.getLine1() == null || addressLineDetail.getLine2() == null)
                throw new InvalidAddressException("Address has a null address line.");
            else if (addressLineDetail.getLine1().isEmpty() || addressLineDetail.getLine2().isEmpty())
                throw new InvalidAddressException("Address has an empty address line");
        }
        return true;
    }

    @Override
    public void prettyPrintAllAddressesInFile() {
        Arrays.stream(AddressUtil.getAddresses())
                .forEach(address -> System.out.println(this.prettyPrintAddress(address)));
    }

    @Override
    public void printAddressOfType(AddressType addressType) {
        Arrays.stream(AddressUtil.getAddresses())
                .filter(address -> address.getType().getName().equalsIgnoreCase(addressType.getName()))
                .forEach(address -> System.out.println(this.prettyPrintAddress(address)));
    }
}
