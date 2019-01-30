package com.investec.assessment.core.domain;

import com.investec.assessment.value.AddressLineDetail;
import com.investec.assessment.value.Country;
import com.investec.assessment.value.Province;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 */
public class Address {

    private int id;
    private AddressType type;
    private String lastUpdated;
    private String postalCode;
    private Country country;
    private AddressLineDetail addressLineDetail;
    private String suburbOrDistrict;
    private String cityOrTown;
    private Province provinceOrState;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public AddressLineDetail getAddressLineDetail() {
        return addressLineDetail;
    }

    public void setAddressLineDetail(AddressLineDetail addressLineDetail) {
        this.addressLineDetail = addressLineDetail;
    }

    public String getSuburbOrDistrict() {
        return suburbOrDistrict;
    }

    public void setSuburbOrDistrict(String suburbOrDistrict) {
        this.suburbOrDistrict = suburbOrDistrict;
    }

    public String getCityOrTown() {
        return cityOrTown;
    }

    public void setCityOrTown(String cityOrTown) {
        this.cityOrTown = cityOrTown;
    }

    public Province getProvinceOrState() {
        return provinceOrState;
    }

    public void setProvinceOrState(Province provinceOrState) {
        this.provinceOrState = provinceOrState;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", type=" + type +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", postalCode=" + postalCode +
                ", country=" + country +
                ", addressLineDetail=" + addressLineDetail +
                ", suburbOrDistrict='" + suburbOrDistrict + '\'' +
                ", cityOrTown='" + cityOrTown + '\'' +
                ", provinceOrState=" + provinceOrState +
                '}';
    }
}
