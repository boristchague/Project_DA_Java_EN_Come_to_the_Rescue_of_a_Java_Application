package com.hemebiotech.analytics;
import java.io.IOException;
import java.util.*;

public class AnalyticsCounter {

	public static void main(String args[]) throws IOException {

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");

		List<String> listSymptoms = reader.GetSymptoms();

		Map symptomFrequency = new TreeMap();

		for(String symptoms: listSymptoms){
			symptomFrequency.put(symptoms, Collections.frequency(listSymptoms, symptoms));
		}

		WriteSymtomDataIntoFile writer = new WriteSymtomDataIntoFile("result.out");

		writer.WriteSymptom(symptomFrequency);

	}

}
