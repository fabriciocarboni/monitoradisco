package com.carboni.monitoradisco.utils;

import java.util.ArrayList;


public class BuildCsv {

	public static String buildArray(String fileMonitoraDisco) throws Exception {

		ArrayList<String> chartValues = FileHandle.readFileAsListOfStrings(fileMonitoraDisco);
		
		StringBuilder sb = new StringBuilder(); // better performance than a simple foreach because
												// it only instantiates a single StringBuilder object outside of the for loop
//		sb.append(header);
		
//		sb.append("[");
		for (String s : chartValues) {
			
			String hr = s.split(";")[0];
			String qtFiles = s.split(";")[1];
//			String totalSize = s.split(";")[2].replaceAll(",", "."); 
			
			sb.append("['");
			sb.append(hr);
			sb.append("',");
			sb.append(qtFiles);
//			sb.append(",");
//			sb.append(totalSize);
			sb.append("],");

		}
		
//	    sb.append("]");
		sb.deleteCharAt(sb.length()-1);

		return sb.toString();

	}

}
