package br.com.carboni.monitoradisco;

import java.io.File;

public class AmtOfFilesInDir {

	public static String getAmtOfFiles(String path) {
	
	int total_files = new File(path).listFiles().length;
	
	return Integer.toString(total_files);
	
	}
	
	
}
