package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class WriteSymtomDataIntoFile implements ISymptomWriter{

    String fileName;
    public WriteSymtomDataIntoFile(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void WriteSymptom(Map map) {


        try {
            //Create a file object
            FileWriter writer = new FileWriter (fileName);

            //Iterate to write into the file
            for(Object symptomKey: map.keySet()) {
                writer.write(symptomKey + " :    " +  map.get(symptomKey) + "\n");
            }

            //close file
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
