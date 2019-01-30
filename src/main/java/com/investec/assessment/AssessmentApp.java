package com.investec.assessment;

import com.investec.assessment.core.base.AddressProcessor;
import com.investec.assessment.core.domain.Address;
import com.investec.assessment.core.impl.AddressProcessorImpl;
import com.investec.assessment.util.JsonDeserializer;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 */
public class AssessmentApp {

    /**
     * My util for serialization and reading of json files.
     */
    private static final JsonDeserializer<Address> ADDRESS_JSON_DESERIALIZER = new JsonDeserializer<>();

    public static void main(String[] args) throws IOException {
        Address[] addresses = ADDRESS_JSON_DESERIALIZER.getObjectsAsArray("/addresses.json", Address[].class);
        AddressProcessor addressProcessor = new AddressProcessorImpl();

        // showing usage of 'prettyPrintAddress' method on all addresses from file.
        Arrays.stream(addresses).forEach(address -> System.out.println(addressProcessor.prettyPrintAddress(address)));
    }
}
