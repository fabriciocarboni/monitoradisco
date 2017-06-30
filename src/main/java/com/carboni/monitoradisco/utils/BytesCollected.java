package com.carboni.monitoradisco.utils;

import java.util.ArrayList;
import java.util.List;

import com.carboni.monitoradisco.utils.ConvertSize;


public class BytesCollected {

	/**
	 * Class to read file and parse bytes collected field for each file
	 * 
	 * @return sum of total bytes collected
	 */

	public static String getAmtOfBytes(String fileJaBaixados) {

		ArrayList<String> lines = null;
		try {
			lines = FileHandle.readFileAsListOfStrings(fileJaBaixados);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(" ==== >>> Arquivo "+ fileJaBaixados + " nao encontrado");
			
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
