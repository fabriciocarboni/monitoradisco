package br.com.carboni.monitoradisco;

import java.io.File;

public class AmtOfFilesInDir {


	
	public static String getAmtOfFiles(String path) {

		int total_files = 0;
		String msg = "Diretorio " + path + " nao existe";
		File dir = new File(path);

		if (dir.exists()) {

			total_files = dir.listFiles().length;
			
			return Integer.toString(total_files);

		} else {
			
			return msg;
			
		}

		

	}

}
