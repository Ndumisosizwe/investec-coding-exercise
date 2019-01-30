package com.investec.assessment.core.domain;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 */
public class AddressType {

    private String code;
    private String name;

    public AddressType() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AddressType{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
