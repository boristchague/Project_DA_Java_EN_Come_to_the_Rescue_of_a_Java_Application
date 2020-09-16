package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class WriteSymtomDataIntoFile implements ISymptomWriter{

    String fileName;
    public WriteSymtomDataIntoFile(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void WriteSymptom(List<String> listSymptom) {


        try {
            //Create a file object
            FileWriter writer = new FileWriter ("results.out");

            //Iterate to write into the file
            for (String s: listSymptom) {
                writer.write(s + " :    " +  Collections.frequency(listSymptom, s) + "\n");
            }

            //close file
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
