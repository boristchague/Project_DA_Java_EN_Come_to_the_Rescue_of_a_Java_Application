package com.hemebiotech.analytics;
import java.io.IOException;
import java.util.*;

public class AnalyticsCounter {

	public static void main(String args[]) throws IOException {

		/** Read file and collect list of symptoms */
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");

		List<String> listSymptoms = reader.GetSymptoms();


		/**put symptoms and frequencies in tree*/
		Map symptomFrequency = new TreeMap();

		for(String symptoms: listSymptoms){
			symptomFrequency.put(symptoms, Collections.frequency(listSymptoms, symptoms));
		}

		/**Write in file*/
		WriteSymtomDataIntoFile writer = new WriteSymtomDataIntoFile("result.out");

		writer.writeSymptom(symptomFrequency);

	}

}
