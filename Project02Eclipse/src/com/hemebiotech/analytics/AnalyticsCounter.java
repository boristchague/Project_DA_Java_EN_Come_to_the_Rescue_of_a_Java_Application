package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AnalyticsCounter {
	//private static int headacheCount = 0;	// initialize to 0
	//private static int rashCount = 0;		// initialize to 0
	//private static int pupilCount = 0;		// initialize to 0"
	
	public static void main(String args[]) throws IOException {

		ReadSymptomDataFromFile RSDF = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");


		// create a Set from List<String> return by rsdf.GetSymptoms()
		Set<String> distinct = new HashSet<String>(RSDF.GetSymptoms());

		//set -> list
		List<String> listString = new ArrayList<String>(distinct);

		//Sort the list
		Collections.sort(listString);


		WriteSymtomDataIntoFile WSDF = new WriteSymtomDataIntoFile("result.out");

		WSDF.WriteSymptom(listString);





		/* TODO
		 ** Interface de l'écriture
		 * utiliser un dictionnaire qui classe directement / interface map,, et plusieur map
		 */

	}

}
