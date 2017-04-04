package br.com.carboni.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

import br.com.carboni.monitoradisco.DateFormat;
import br.com.carboni.monitoradisco.Configuracao;

public class FileHandle {

	public static ArrayList<String> readFileAsListOfStrings(String path, String filename) throws Exception {
		ArrayList<String> records = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new FileReader(path + "/" + filename));
		String line;
		while ((line = reader.readLine()) != null) {
			records.add(line);
		}
		reader.close();
		return records;
	}

	public static void writeToFile(String path, String filename_formatted, String total_files, String total_files_size)
			throws IOException {

		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(Configuracao.path_monitora_disco + filename_formatted, true), "utf-8"))) {

			// writer.write(DateFormat.FormatDate() + ";" +
			// DateFormat.FormatHour() + ";" + total_files + ";" +
			// total_files_size + "\n");
			writer.write(DateFormat.FormatDate() + ";" + DateFormat.FormatHour() + ";" + total_files + ";"
					+ total_files_size + System.getProperty("line.separator"));

		}
	}
}
