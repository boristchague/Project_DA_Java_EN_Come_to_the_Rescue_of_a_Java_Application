package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */
public class WriteSymtomDataIntoFile implements ISymptomWriter{

    private final String fileName;

    /**
     *
     * @param fileName a full or partial path to file with symptom strings in it, one per line
     */
    public WriteSymtomDataIntoFile(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void writeSymptom(Map map) {

        try {

            FileWriter writer = new FileWriter (fileName);

            for(Object symptomKey: map.keySet()) {
                writer.write(symptomKey + " :    " +  map.get(symptomKey) + "\n");
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
