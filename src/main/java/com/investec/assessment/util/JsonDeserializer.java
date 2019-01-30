package com.investec.assessment.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

/**
 * @author Ndumiso
 * @since 30-Jan-19
 */
public class JsonDeserializer<T> {


    /**
     * Reads a Json file expected to have an array of type T objects in javascript notation and returns them
     * as an array of POJOs.
     *
     * @param fileName The path of the .json file
     * @param tClass   The real type of T.
     * @return An array of objects of type T
     * @throws IOException If something goes wrong with the specified file.
     */
    public T[] getObjectsAsArray(String fileName, Class<T[]> tClass) throws IOException {
        T[] objects;
        try (Reader reader = new InputStreamReader(JsonDeserializer.class.getResourceAsStream(fileName), StandardCharsets.UTF_8)) {
            Gson gson = new GsonBuilder().create();
            objects = gson.fromJson(reader, tClass);
        }
        return objects;
    }

}
