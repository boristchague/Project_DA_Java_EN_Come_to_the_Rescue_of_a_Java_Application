package com.hemebiotech.analytics;


import java.util.Map;

public interface ISymptomWriter {

    /**
     * Anything that will write symptom data into a file using a map containing symptoms and its frequecies
     * return nothing
     */
    public void writeSymptom(Map<String, Integer> map);

    /**
     * iterate throught the map to collect symptoms and its frequecies, which it writes into the file
     */
}
