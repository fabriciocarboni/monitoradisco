package br.com.carboni.monitoradisco;

import java.util.ArrayList;
import java.util.List;

import br.com.carboni.utils.FileHandle;

public class BytesCollected {



	public static String getAmountOfBytes() throws Exception {

//		final String filename_formatted = DateFormat.FormatDate() + filename;

		// chama o metodo para abrir arquivo

			ArrayList<String> lines = FileHandle.readFileAsListOfStrings(Configuracao.path_controle_coleta, "ja_baixados_20170324.txt");
			// ArrayList<String> lines =
			// FileHandle.readFileAsListOfStrings(path_controle_coleta,
			// "ja_baixados_" + dataFormatada + ".txt");

			List<Integer> total_size = new ArrayList<>(); // arraylist de
															// inteiros para
															// armazenar todos
															// os bytes
			// Deque<Integer> total_size = new ArrayDeque<>();
			for (String i : lines) {
				// int bytes = Integer.parseInt(i.split(",")[4]);
				String[] arr = i.split(",");
				String bytes = arr[arr.length - 2]; // penultimo campo da string
				total_size.add(Integer.parseInt(bytes));
			}

			// Summing all elements
			long total = 0;
			for (int i = 0; i < total_size.size(); i++) {
				total += total_size.get(i);
			}

			String total_files_size = ConvertSize.formatFileSize(total);
			
//			FileHandle.writeToFile(path_monitora_disco, filename_formatted, Integer.toString(AmtOfFilesInDir.getAmtOfFiles(work_dir)),total_files_size);


		return total_files_size;
		
		
		
		
	}

}
