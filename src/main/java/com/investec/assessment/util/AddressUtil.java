package com.investec.assessment.util;

import com.investec.assessment.core.domain.Address;

import java.io.IOException;

/**
 * Address Utility class
 *
 * @author Ndumiso
 * @since 30-Jan-19
 */
public class AddressUtil {

    /**
     * My generic util class for serialization and reading of json files.
     */
    private static final JsonDeserializer<Address> ADDRESS_JSON_DESERIALIZER = new JsonDeserializer<>();
    private static Address[] addresses;

    static {
        try {
            addresses = ADDRESS_JSON_DESERIALIZER.getObjectsAsArray("/addresses.json", Address[].class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static {

    }

    /**
     * @return Returns an array of all addresses from the file.
     */
    public static Address[] getAddresses() {
        return addresses;
    }
}
