package br.com.carboni.monitoradisco;

import java.util.ArrayList;
import java.util.List;

import br.com.carboni.utils.FileHandle;

public class BytesCollected {

	/**
	 * Class to read file and parse bytes collected field for each file
	 * 
	 * @return sum of total bytes collected
	 */

	public static String getAmountOfBytes() {

		String fileJaBaixados = Configuracao.fileJaBaixados;

		ArrayList<String> lines = null;
		try {
			lines = FileHandle.readFileAsListOfStrings(Configuracao.path_controle_coleta, fileJaBaixados);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(" ==== >>> Arquivo "+ fileJaBaixados + " não encontrado");
			System.out.println(Configuracao.path_controle_coleta + fileJaBaixados);
		}

		List<Integer> total_size = new ArrayList<>(); // arraylist de inteiros
														// para armazenar todos
														// os bytes lidos no
														// arquivo
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

		return total_files_size;

	}

}
