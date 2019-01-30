package com.investec.assessment;

import com.investec.assessment.core.base.AddressProcessor;
import com.investec.assessment.core.base.Calculator;
import com.investec.assessment.core.domain.Address;
import com.investec.assessment.core.domain.AddressType;
import com.investec.assessment.core.impl.AddressProcessorImpl;
import com.investec.assessment.core.impl.CalculatorImpl;
import com.investec.assessment.util.AddressUtil;
import com.investec.assessment.value.Country;
import com.investec.assessment.value.Province;

import java.util.Arrays;

import static com.investec.assessment.value.AddressType.BUSINESS;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 */
public class AssessmentApp {


    public static void main(String[] args) {

        // Finding GCD
        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.highestCommonFactor(new int[]{1, 6, 878, 1, 44, 6, 9}));
        System.out.println();

        AddressProcessor addressProcessor = new AddressProcessorImpl();

        // Showing usage of 'prettyPrintAddress' method. Pretty printing all addresses in file
        Arrays.stream(AddressUtil.getAddresses())
                .forEach(address -> System.out.println(addressProcessor.prettyPrintAddress(address)));
        System.out.println();

        // Printing ONLY 'Business Addresses'
        addressProcessor.printAddressOfType(new AddressType("145", BUSINESS.getName()));
        System.out.println();


        // Validating an address, in this example i only test postal code deliberately
        Address address = new Address();
        address.setPostalCode("48354"); // should be numeric
        address.setCountry(new Country("ZA", "South Africa"));
        address.setProvinceOrState(new Province());
        System.out.println(addressProcessor.isValid(address));

    }
}
