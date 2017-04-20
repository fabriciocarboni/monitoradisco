package br.com.carboni.monitoradisco;

import java.util.ArrayList;

import br.com.carboni.utils.FileHandle;


public class ChartValuesBuilder {

	public static String buildArrayCategories(String fileMonitoraDisco) throws Exception {

		ArrayList<String> chartValues = FileHandle.readFileAsListOfStrings(fileMonitoraDisco);
		
		StringBuilder sb = new StringBuilder(); // better performance than a simple foreach because
												// it only instantiates a single StringBuilder object outside of the for loop

		
		for (String s : chartValues) {
			
			String categoriesHr = s.split(";")[0];
			
			sb.append("'");
			sb.append(categoriesHr);
			sb.append("'");
			sb.append(",");
		}
		
		sb.deleteCharAt(sb.length()-1);
		
		
		return sb.toString();

	}
	
	
	public static String buildArrayAmtFilesValue(String fileMonitoraDisco) throws Exception {

		ArrayList<String> chartValues = FileHandle.readFileAsListOfStrings(fileMonitoraDisco);
		
		StringBuilder sb = new StringBuilder();
		
		for (String s : chartValues) {
			
			String amtOfFiles = s.split(";")[1];
			
			sb.append(amtOfFiles);
			sb.append(",");
		}
		
		sb.deleteCharAt(sb.length()-1);

		return sb.toString();

	}
	
	
	public static String buildArrayTotalFileSizeValue(String fileMonitoraDisco) throws Exception {

		ArrayList<String> chartValues = FileHandle.readFileAsListOfStrings(fileMonitoraDisco);
		
		StringBuilder sb = new StringBuilder();
		
		for (String s : chartValues) {
			
			String amtOfFiles = s.split(";")[1];
			
			sb.append(amtOfFiles);
			sb.append(",");
		}
		
		sb.deleteCharAt(sb.length()-1);

		return sb.toString();

	}
	
	

}
