package com.investec.assessment.value;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 */
public enum AddressType {

    POSTAL("Postal Address"), PHYSICAL("Physical Address"), BUSINESS("Business Address");

    private String name;

    AddressType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
