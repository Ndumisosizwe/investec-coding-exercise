package com.investec.assessment.value;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 */
public class Province {

    private String code;
    private String name;

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
        return "Province{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
