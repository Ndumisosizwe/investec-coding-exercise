package com.investec.assessment.value;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 */
public class Country {

    private String code;
    private String name;

    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }
}
