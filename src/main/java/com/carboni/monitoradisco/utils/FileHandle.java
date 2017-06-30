package com.carboni.monitoradisco.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class FileHandle {

	public static ArrayList<String> readFileAsListOfStrings(String fileJaBaixados) throws Exception {
		ArrayList<String> records = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(fileJaBaixados));
		String line;
		while ((line = reader.readLine()) != null) {
			records.add(line);
		}
		reader.close();
		return records;
	}

/*	public static void writeToFile(String path, String filename_formatted, String total_files, String total_files_size)
			throws IOException {

		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(Configuracao.path_monitora_disco + filename_formatted, true), "utf-8"))) {

			writer.write(//DateFormat.FormatDate() + ";" 
						DateFormat.FormatHour() + ";" 
						+ total_files + ";"
						+ total_files_size 
						+ System.getProperty("line.separator"));

		}
	}*/
	
	
	public static String readFileAsString(String file) throws Exception {
		
		String line = new String(Files.readAllBytes(Paths.get(file)));
		
		return line;
	}
		
	
}
